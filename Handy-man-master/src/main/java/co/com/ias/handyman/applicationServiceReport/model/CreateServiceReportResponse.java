package co.com.ias.handyman.applicationServiceReport.model;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationResponse;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;

public class CreateServiceReportResponse implements ApplicationResponse {
    private  final ServiceReport serviceReport;


    public CreateServiceReportResponse(ServiceReport serviceReport) {
        this.serviceReport = serviceReport;
    }

    public ServiceReport getServiceReport() {
        return serviceReport;
    }

    @Override
    public String toString() {
        return "CreateServiceReportResponse{" +
                "serviceReport=" + serviceReport +
                '}';
    }
}
