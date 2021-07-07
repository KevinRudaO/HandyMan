package co.com.ias.handyman.applicationServiceReport.domain;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyStartDate;
import co.com.ias.handyman.applicationServiceReport.commons.Validate;
import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyFinishDate;

public class ServiceReport {

     TechnicalIdentification technicalIdentification;
     ServiceIdentification serviceIdentification;
     NonEmptyStartDate startDate;
     NonEmptyFinishDate finishDate;

    public ServiceReport(TechnicalIdentification technicalIdentification, ServiceIdentification serviceIdentification, NonEmptyStartDate startDate, NonEmptyFinishDate finishDate) {
        Validate.notNull(technicalIdentification,"technical Identification cant be null");
        Validate.notNull(serviceIdentification,"service Identification cant be null");
        Validate.notNull(startDate,"Start date cant be null");
        Validate.notNull(finishDate,"Finish date cant be null");
      //  Validate.validateDate(startDate,finishDate,"Finish date cant be before to start date");

        this.technicalIdentification = technicalIdentification;
        this.serviceIdentification = serviceIdentification;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public TechnicalIdentification getTechnicalIdentification() {
        return technicalIdentification;
    }

    public ServiceIdentification getServiceIdentification() {
        return serviceIdentification;
    }

    public NonEmptyStartDate getStartDate() {
        return startDate;
    }

    public NonEmptyFinishDate getFinishDate() {
        return finishDate;
    }
}
