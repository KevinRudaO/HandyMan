package co.com.ias.handyman.calculateInfraestructure.adapters.out;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyFinishDate;
import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyStartDate;
import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyString;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceIdentification;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;
import co.com.ias.handyman.applicationServiceReport.domain.TechnicalIdentification;
import co.com.ias.handyman.calculateApplication.domain.CalculateDates;
import co.com.ias.handyman.calculateApplication.ports.out.CalculationRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

@Repository
public class SqlRepositoryCalculate implements CalculationRepository {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<CalculateDates> reportRowMapper = (rs, RowNum)->fromResultSet(rs);

    public SqlRepositoryCalculate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Collection<CalculateDates> getReportById(TechnicalIdentification technicalIdentification, ServiceIdentification anio) {
        final String sql ="SELECT * FROM servicereport WHERE TECHNICALID= ? AND STARTDATE >= CAST( ? AS datetime)";
        PreparedStatementSetter preparedStatementSetter=ps ->{
            ps.setString(1,technicalIdentification.getTechnicalId());
            ps.setString(2,anio.getServiceId());
        };

        return jdbcTemplate.query(sql,preparedStatementSetter,reportRowMapper);
    }

    private static CalculateDates fromResultSet (ResultSet rs) throws SQLException {
        return new CalculateDates(
                new NonEmptyStartDate(rs.getString("startDate")),
                new NonEmptyFinishDate(rs.getString("finishDate"))

        );
    }
}
