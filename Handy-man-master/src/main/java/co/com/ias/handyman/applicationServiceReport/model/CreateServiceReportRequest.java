package co.com.ias.handyman.applicationServiceReport.model;

import co.com.ias.handyman.applicationServiceReport.commons.operations.ApplicationRequest;
import lombok.*;


@Data @AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
public class CreateServiceReportRequest implements ApplicationRequest {

    private String technicalIdentification;
    private String serviceIdentification;
    private String startDate;
    private String finishDate;


}