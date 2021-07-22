package co.com.ias.handyman.calculateApplication.model;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationRequest;

import java.util.Objects;

public class CreateCalculationRequest implements ApplicationRequest {
    private String techId;
    private String anio;

    public CreateCalculationRequest() {
    }

    public CreateCalculationRequest(String techId, String anio) {
        this.techId = techId;
        this.anio = anio;
    }

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCalculationRequest that = (CreateCalculationRequest) o;
        return Objects.equals(techId, that.techId) && Objects.equals(anio, that.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(techId, anio);
    }

    @Override
    public String toString() {
        return "CreateCalculationRequest{" +
                "techId='" + techId + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }
}

