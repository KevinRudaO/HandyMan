package co.com.ias.handyman.applicationServiceReport.domain;

import co.com.ias.handyman.applicationServiceReport.commons.StringUtils;
import co.com.ias.handyman.applicationServiceReport.commons.Validate;

import java.util.Objects;

public class TechnicalIdentification {

private final String technicalId;

    public TechnicalIdentification(String technicalId) {
        Validate.notNull(technicalId,"Technical Identification cant be null");
        Validate.isTrue(StringUtils.nonBlank(technicalId),"Technical Identification cant be blank");
        this.technicalId = technicalId;
    }

    public String getTechnicalId() {
        return technicalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnicalIdentification that = (TechnicalIdentification) o;
        return Objects.equals(technicalId, that.technicalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technicalId);
    }

    @Override
    public String toString() {
        return "TechnicalIdentification{" +
                "technicalId='" + technicalId + '\'' +
                '}';
    }
}
