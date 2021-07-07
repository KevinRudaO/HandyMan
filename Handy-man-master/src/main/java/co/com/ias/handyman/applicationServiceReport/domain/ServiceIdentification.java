package co.com.ias.handyman.applicationServiceReport.domain;

import co.com.ias.handyman.applicationServiceReport.commons.StringUtils;
import co.com.ias.handyman.applicationServiceReport.commons.Validate;

import java.util.Objects;

public class ServiceIdentification {
    private final String serviceId;

    public ServiceIdentification(String serviceId) {
        Validate.notNull(serviceId,"Service identification report cant be null");
        Validate.isTrue(StringUtils.nonBlank(serviceId),"Service identification report cant be blank");
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceIdentification that = (ServiceIdentification) o;
        return Objects.equals(serviceId, that.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId);
    }

    @Override
    public String toString() {
        return "ServiceIdentification{" +
                "serviceId='" + serviceId + '\'' +
                '}';
    }
}
