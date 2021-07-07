package co.com.ias.handyman.applicationServiceReport.commons;
import static co.com.ias.handyman.applicationServiceReport.commons.StringUtils.antNon;


public class NonEmptyString {
    private final String value;


    public NonEmptyString(String value) {
    Validate.notNull(value,"NonEmptyString can not be null");
    Validate.isTrue(antNon(value),"NonEmptyString can not be empty");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "NonEmptyString{" +
                "value='" + value + '\'' +
                '}';
    }
}
