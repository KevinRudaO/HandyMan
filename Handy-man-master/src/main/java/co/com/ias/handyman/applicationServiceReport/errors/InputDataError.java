package co.com.ias.handyman.applicationServiceReport.errors;


import co.com.ias.handyman.applicationServiceReport.commons.error.ApplicationError;
import co.com.ias.handyman.applicationServiceReport.commons.error.HttpStatusCode;

public class InputDataError extends ApplicationError {

    private final String message;

    public InputDataError(String message) {
        this.message = message;
    }

    @Override
    public String errorCode() {
        return "INPUT_DATA_ERROR";
    }

    @Override
    public HttpStatusCode httpStatusCode() {
        return HttpStatusCode.BAD_REQUEST;
    }
}
