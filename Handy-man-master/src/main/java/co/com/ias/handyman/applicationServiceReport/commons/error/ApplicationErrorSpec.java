package co.com.ias.handyman.applicationServiceReport.commons.error;

import java.util.Map;

public interface ApplicationErrorSpec {
    String errorCode();

    HttpStatusCode httpStatusCode();

    String getMessage();

    default Map<String, Object> metadata() {
        return Map.of();
    }
}
