package co.com.ias.handyman.applicationServiceReport.commons.error;

public enum HttpStatusCode {
    BAD_REQUEST(400),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    HttpStatusCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
