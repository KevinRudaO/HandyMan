package co.com.ias.handyman.infraestructureServiceReport.configuration;

import co.com.ias.handyman.applicationServiceReport.ports.in.CreateServiceReportUseCase;
import co.com.ias.handyman.applicationServiceReport.ports.out.ServiceReportRepository;
import co.com.ias.handyman.applicationServiceReport.service.CreateServiceReportService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceReportConfiguration {
    @Bean
    public CreateServiceReportUseCase createServiceReportUseCase(ServiceReportRepository serviceReportRepository){
    return new CreateServiceReportService(serviceReportRepository);
    }
}
