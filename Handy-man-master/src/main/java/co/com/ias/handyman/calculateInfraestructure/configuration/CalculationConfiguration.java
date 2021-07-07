package co.com.ias.handyman.calculateInfraestructure.configuration;

import co.com.ias.handyman.calculateApplication.ports.in.CreateCalculationUseCase;
import co.com.ias.handyman.calculateApplication.ports.out.CalculationRepository;
import co.com.ias.handyman.calculateApplication.service.CalculationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculationConfiguration {
    @Bean
    public CreateCalculationUseCase createCalculationUseCase(CalculationRepository calculationRepository){
        return new CalculationService(calculationRepository);
    }
}
