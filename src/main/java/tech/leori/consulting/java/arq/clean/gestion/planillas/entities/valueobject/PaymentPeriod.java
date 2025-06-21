package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject;

import java.time.YearMonth;
import java.util.Objects;

public class PaymentPeriod {

    private final int year;
    private final int month;

    private PaymentPeriod(int year, int monh) {
        this.year = year;
        this.month = monh;
    }

    public static PaymentPeriod of(int year, int month) {
        if (year < 1900 || year > 3000) {
            throw new IllegalArgumentException("Año fuera de rango válido.");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Mes debe estar entre 1 y 12.");
        }

        return new PaymentPeriod(year, month);
    }

    public static PaymentPeriod from(YearMonth yearMonth) {
        return new PaymentPeriod(yearMonth.getYear(), yearMonth.getMonthValue());
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public YearMonth toYearMonth() {
        return YearMonth.of(year, month);
    }

    public boolean isSamePeriod(PaymentPeriod another) {
        return this.year == another.year && this.month == another.month;
    }

    public boolean isBeforeTo(PaymentPeriod another) {
        return this.toYearMonth().isBefore(another.toYearMonth());
    }

    public boolean isAfterTo(PaymentPeriod another) {
        return this.toYearMonth().isAfter(another.toYearMonth());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentPeriod)) return false;
        PaymentPeriod that = (PaymentPeriod) o;
        return year == that.year && month == that.month;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month);
    }

    @Override
    public String toString() {
        return String.format("%d-%02d", year, month);
    }
}
