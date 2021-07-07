package co.com.ias.handyman.applicationServiceReport.ports.out;

import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;

public interface ServiceReportRepository {
    void storeServiceReport (ServiceReport serviceReport);
}
