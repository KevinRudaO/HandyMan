package co.com.ias.handyman.applicationServiceReport.model;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationRequest;

import java.time.LocalDateTime;
import java.util.Objects;

public class CreateServiceReportRequest implements ApplicationRequest {

    private String technicalIdentification;
    private String serviceIdentification;
    private String startDate;
    private String finishDate;

    public CreateServiceReportRequest() {
    }

    public CreateServiceReportRequest(String technicalIdentification, String serviceIdentification, String startDate, String finishDate) {
        this.technicalIdentification = technicalIdentification;
        this.serviceIdentification = serviceIdentification;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public String getTechnicalIdentification() {
        return technicalIdentification;
    }

    public void setTechnicalIdentification(String technicalIdentification) {
        this.technicalIdentification = technicalIdentification;
    }

    public String getServiceIdentification() {
        return serviceIdentification;
    }

    public void setServiceIdentification(String serviceIdentification) {
        this.serviceIdentification = serviceIdentification;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateServiceReportRequest that = (CreateServiceReportRequest) o;
        return Objects.equals(technicalIdentification, that.technicalIdentification) && Objects.equals(serviceIdentification, that.serviceIdentification) && Objects.equals(startDate, that.startDate) && Objects.equals(finishDate, that.finishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technicalIdentification, serviceIdentification, startDate, finishDate);
    }

    @Override
    public String toString() {
        return "CreateServiceReportRequest{" +
                "technicalIdentification='" + technicalIdentification + '\'' +
                ", serviceIdentification='" + serviceIdentification + '\'' +
                ", startDate='" + startDate + '\'' +
                ", finishDate='" + finishDate + '\'' +
                '}';
    }
}