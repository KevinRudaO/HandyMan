package co.com.ias.handyman.calculateApplication.ports.out;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyString;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceIdentification;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;
import co.com.ias.handyman.applicationServiceReport.domain.TechnicalIdentification;
import co.com.ias.handyman.calculateApplication.domain.CalculateDates;

import java.util.Collection;

public interface CalculationRepository {
    Collection<CalculateDates>getReportById(TechnicalIdentification technicalIdentification, ServiceIdentification anio);
}
