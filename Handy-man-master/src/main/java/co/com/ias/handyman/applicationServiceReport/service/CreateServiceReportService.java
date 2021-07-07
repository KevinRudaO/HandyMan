package co.com.ias.handyman.applicationServiceReport.service;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyStartDate;
import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyFinishDate;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceIdentification;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;
import co.com.ias.handyman.applicationServiceReport.domain.TechnicalIdentification;
import co.com.ias.handyman.applicationServiceReport.errors.InputDataError;
import co.com.ias.handyman.applicationServiceReport.model.CreateServiceReportRequest;
import co.com.ias.handyman.applicationServiceReport.model.CreateServiceReportResponse;
import co.com.ias.handyman.applicationServiceReport.ports.in.CreateServiceReportUseCase;
import co.com.ias.handyman.applicationServiceReport.ports.out.ServiceReportRepository;

public class CreateServiceReportService implements CreateServiceReportUseCase {
private final ServiceReportRepository serviceReportRepository;

    public CreateServiceReportService(ServiceReportRepository serviceReportRepository) {
        this.serviceReportRepository = serviceReportRepository;
    }

    @Override
    public CreateServiceReportResponse execute(CreateServiceReportRequest request) {
        ServiceReport serviceReport= validateInput(request);

        serviceReportRepository.storeServiceReport(serviceReport);
        return new CreateServiceReportResponse(serviceReport);
    }
    private ServiceReport validateInput (CreateServiceReportRequest request){

        try {
            TechnicalIdentification technicalIdentification = new TechnicalIdentification(request.getTechnicalIdentification());
            ServiceIdentification serviceIdentification = new ServiceIdentification(request.getServiceIdentification());
            NonEmptyStartDate nonEmptyDate = new NonEmptyStartDate(request.getStartDate());
            NonEmptyFinishDate nonEmptyFinishDate =new NonEmptyFinishDate(request.getFinishDate());

            return new ServiceReport(
                    technicalIdentification,
                    serviceIdentification,
                    nonEmptyDate,
                    nonEmptyFinishDate
            );
        }catch (RuntimeException e){
            throw new InputDataError(e.getMessage());
        }
    }
}
