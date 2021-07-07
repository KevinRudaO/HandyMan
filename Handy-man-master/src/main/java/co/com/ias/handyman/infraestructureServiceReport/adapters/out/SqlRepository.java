package co.com.ias.handyman.infraestructureServiceReport.adapters.out;

import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;
import co.com.ias.handyman.applicationServiceReport.ports.out.ServiceReportRepository;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;

@Repository
public class SqlRepository implements ServiceReportRepository {
    private final JdbcTemplate jdbcTemplate;

    public SqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void storeServiceReport(ServiceReport serviceReport) {
        jdbcTemplate.update(connection -> {
            final PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO SERVICEREPORT (TECHNICALID, SERVICEID,STARTDATE,FINISHDATE)VALUES (?,?,?,?)");
            preparedStatement.setString(1,serviceReport.getTechnicalIdentification().getTechnicalId());
            preparedStatement.setString(2,serviceReport.getServiceIdentification().getServiceId());
            preparedStatement.setString(3,serviceReport.getStartDate().getStartDate());
            preparedStatement.setString(4,serviceReport.getFinishDate().getFinishDate());
        return preparedStatement;
        });
    }
}
