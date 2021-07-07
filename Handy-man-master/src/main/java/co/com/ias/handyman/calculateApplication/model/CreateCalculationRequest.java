package co.com.ias.handyman.calculateApplication.model;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationRequest;

import java.util.Objects;

public class CreateCalculationRequest implements ApplicationRequest {
    private String techId;

    public CreateCalculationRequest() {
    }

    public CreateCalculationRequest(String techId) {
        this.techId = techId;
    }

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCalculationRequest that = (CreateCalculationRequest) o;
        return Objects.equals(techId, that.techId);
    }

    @Override
    public String toString() {
        return "CreateCalculationRequest{" +
                "techId='" + techId + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(techId);
    }
}

