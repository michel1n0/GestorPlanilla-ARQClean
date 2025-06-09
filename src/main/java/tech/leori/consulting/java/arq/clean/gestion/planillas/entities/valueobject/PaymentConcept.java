package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.ConceptType;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.DomainException;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.GenericDomain;

import java.math.BigDecimal;
import java.util.Objects;

public class PaymentConcept {
    private final String name;
    private final BigDecimal amount;
    private final ConceptType type;

    private PaymentConcept(String name, BigDecimal amount, ConceptType type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    public static PaymentConcept of(String name, BigDecimal amount, ConceptType type) throws DomainException {
        if (name == null || name.trim().isEmpty()) {
            throw new DomainException("El nombre del concepto no puede estar vacío.");
        }

        if (amount == null || amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new DomainException("El monto no puede ser negativo ni nulo.");
        }

        if (type == null) {
            throw new DomainException("El tipo de concepto es obligatorio.");
        }

        return new PaymentConcept(name.trim(), amount, type);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public ConceptType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentConcept)) return false;
        PaymentConcept that = (PaymentConcept) o;
        return Objects.equals(name, that.name)
                && Objects.equals(amount, that.amount)
                && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, type);
    }

    @Override
    public String toString() {
        return "PaymentConcept{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
