package co.com.ias.handyman.calculateApplication.ports.in;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationUseCase;
import co.com.ias.handyman.calculateApplication.model.CreateCalculationRequest;
import co.com.ias.handyman.calculateApplication.model.CreateCalculationResponse;

public interface CreateCalculationUseCase extends ApplicationUseCase <CreateCalculationRequest, CreateCalculationResponse> {
}
