package co.com.ias.handyman.applicationServiceReport.commons;

import java.time.LocalDateTime;
import java.util.Objects;

public class NonEmptyStartDate {
    private final String startDate;


public NonEmptyStartDate(String startDate) {

        Validate.notNull(startDate, "Start date cant be null");
            this.startDate = startDate;
    }


    public String getStartDate() {
        return startDate;
    }

  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonEmptyStartDate that = (NonEmptyStartDate) o;
        return Objects.equals(startDate, that.startDate) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate);
    }
}
