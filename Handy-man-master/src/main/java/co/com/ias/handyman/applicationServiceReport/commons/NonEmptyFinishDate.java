package co.com.ias.handyman.applicationServiceReport.commons;

import java.time.LocalDateTime;
import java.util.Objects;

public class NonEmptyFinishDate {
    private final String finishDate;

    public NonEmptyFinishDate(String finishDate) {
        Validate.notNull(finishDate,"Finish Date cant be null");
        this.finishDate = finishDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonEmptyFinishDate that = (NonEmptyFinishDate) o;
        return Objects.equals(finishDate, that.finishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(finishDate);
    }

    @Override
    public String toString() {
        return "NonEmptyFinishDate{" +
                "finishDate=" + finishDate +
                '}';
    }
}
