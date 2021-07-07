package co.com.ias.handyman.calculateApplication.model;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationResponse;
import co.com.ias.handyman.applicationServiceReport.domain.ServiceReport;
import co.com.ias.handyman.calculateApplication.domain.CalculateDates;

import java.util.Collection;

public class CreateCalculationResponse implements ApplicationResponse {

    private final Collection<CalculateDates> items;

    public CreateCalculationResponse(Collection<CalculateDates> items) {
        this.items = items;
    }
    public Collection<CalculateDates> getItems() {
        return items;
    }
}
