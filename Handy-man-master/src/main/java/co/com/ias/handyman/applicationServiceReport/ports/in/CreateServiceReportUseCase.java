package co.com.ias.handyman.applicationServiceReport.ports.in;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationUseCase;
import co.com.ias.handyman.applicationServiceReport.model.CreateServiceReportRequest;
import co.com.ias.handyman.applicationServiceReport.model.CreateServiceReportResponse;

public interface CreateServiceReportUseCase extends ApplicationUseCase <CreateServiceReportRequest, CreateServiceReportResponse> {

}
