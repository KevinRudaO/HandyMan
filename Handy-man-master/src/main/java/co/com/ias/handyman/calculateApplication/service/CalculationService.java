package co.com.ias.handyman.calculateApplication.service;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyString;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;
import co.com.ias.handyman.applicationServiceReport.domain.TechnicalIdentification;
import co.com.ias.handyman.calculateApplication.domain.CalculateDates;
import co.com.ias.handyman.calculateApplication.model.CreateCalculationRequest;
import co.com.ias.handyman.calculateApplication.model.CreateCalculationResponse;
import co.com.ias.handyman.calculateApplication.ports.in.CreateCalculationUseCase;
import co.com.ias.handyman.calculateApplication.ports.out.CalculationRepository;

import java.util.Collection;

public class CalculationService implements CreateCalculationUseCase {
    private final CalculationRepository repository;


    public CalculationService(CalculationRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateCalculationResponse execute(CreateCalculationRequest request) {
        Collection<CalculateDates>calculate = repository.getReportById(new TechnicalIdentification(request.getTechId()));

        return new CreateCalculationResponse(calculate);
    }
}
