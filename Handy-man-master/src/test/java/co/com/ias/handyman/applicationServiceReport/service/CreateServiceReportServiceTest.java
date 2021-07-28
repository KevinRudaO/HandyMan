package co.com.ias.handyman.applicationServiceReport.service;

import co.com.ias.handyman.applicationServiceReport.domain.TechnicalIdentification;
import co.com.ias.handyman.applicationServiceReport.model.CreateServiceReportRequest;
import co.com.ias.handyman.applicationServiceReport.model.CreateServiceReportResponse;
import co.com.ias.handyman.applicationServiceReport.ports.out.ServiceReportRepository;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CreateServiceReportServiceTest {
    @Test
    void ifProductExitsItGetsCreated(){

        ServiceReportRepository repository = Mockito.mock(ServiceReportRepository.class);

        CreateServiceReportService createServiceReportService= new CreateServiceReportService(repository);
        final String techId="21545";
        CreateServiceReportRequest createServiceReportRequest = new CreateServiceReportRequest(
                techId,"name","2021-07-06T21:00","2021-07-06T22:00");
        //act
        CreateServiceReportResponse createServiceReportResponse= createServiceReportService.execute(createServiceReportRequest);
        //assert
        assertAll(
                ()-> assertDoesNotThrow(()-> createServiceReportService.execute(createServiceReportRequest)),
                ()->assertEquals(
                        createServiceReportRequest.getTechnicalIdentification(),
                        techId)
        );
    }

}