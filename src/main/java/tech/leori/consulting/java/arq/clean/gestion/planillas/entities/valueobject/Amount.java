package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject;

import java.math.BigDecimal;
import java.util.Currency;

public class Amount {
    private final BigDecimal value;
    private final Currency currency;

    public Amount(BigDecimal value, Currency currency) {
        if (value == null || currency == null) {
            throw new IllegalArgumentException("El valor y la moneda no pueden ser nulos.");
        }

        if(value.compareTo(BigDecimal.ZERO)< 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Amount add(Amount other) {
        validateCurrencyMatch(other);
        return new Amount(this.value.add(other.value), this.currency);
    }

    public Amount subtract(Amount other) {
        validateCurrencyMatch(other);
        return new Amount(this.value.subtract(other.value), this.currency);
    }

    private void validateCurrencyMatch(Amount other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException("Las monedas no coinciden.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount)) return false;
        Amount amount = (Amount) o;
        return value.equals(amount.value) && currency.equals(amount.currency);
    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        result = 31 * result + currency.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "value=" + value +
                ", currency=" + currency.getCurrencyCode() +
                '}';
    }
}
