package co.com.ias.handyman.calculateApplication.domain;

import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyFinishDate;
import co.com.ias.handyman.applicationServiceReport.commons.NonEmptyStartDate;

import java.util.Objects;

public class CalculateDates {
    NonEmptyStartDate startDate;
    NonEmptyFinishDate finishDate;

    public CalculateDates(NonEmptyStartDate startDate, NonEmptyFinishDate finishDate) {
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public NonEmptyStartDate getStartDate() {
        return startDate;
    }

    public void setStartDate(NonEmptyStartDate startDate) {
        this.startDate = startDate;
    }

    public NonEmptyFinishDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(NonEmptyFinishDate finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculateDates that = (CalculateDates) o;
        return Objects.equals(startDate, that.startDate) && Objects.equals(finishDate, that.finishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, finishDate);
    }

    @Override
    public String toString() {
        return "CalculateDates{" +
                "startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }
}
