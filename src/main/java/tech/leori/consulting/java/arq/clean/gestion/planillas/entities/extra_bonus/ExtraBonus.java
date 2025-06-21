package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.extra_bonus;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.Amount;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ExtraBonus {
    private final Long id;
    private final Long employeeId;
    private final Amount amount;
    private final String description;
    private final LocalDate grantedDate;
    private final PaymentPeriod applicationPeriod;

    private ExtraBonus(Builder builder) {
        this.id = builder.id;
        this.employeeId = builder.employeeId;
        this.amount = builder.amount;
        this.description = builder.description;
        this.grantedDate = builder.grantedDate;
        this.applicationPeriod = builder.applicationPeriod;
    }

    public static class Builder {
        private Long id;
        private Long employeeId;
        private Amount amount;
        private String description;
        private LocalDate grantedDate;
        private PaymentPeriod applicationPeriod;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder employeeId(Long employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder amount(Amount amount) {
            this.amount = amount;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder grantedDate(LocalDate grantedDate) {
            this.grantedDate = grantedDate;
            return this;
        }

        public Builder applicationPeriod(PaymentPeriod applicationPeriod) {
            this.applicationPeriod = applicationPeriod;
            return this;
        }

        public ExtraBonus build() throws ExtraBonusException{
            if(amount == null || amount.getValue().compareTo(BigDecimal.ZERO) < 0) {
                throw new ExtraBonusException("El monto del bono extra no puede ser nulo ni negativo.");
            }

            if(description == null || description.trim().isEmpty() || description.isBlank()) {
                throw new ExtraBonusException("La descripción del bono extra no puede estar vacía.");
            }
            return new ExtraBonus(this);
        }
    }

    public Long getId() {
        return id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Amount getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getGrantedDate() {
        return grantedDate;
    }

    public PaymentPeriod getApplicationPeriod() {
        return applicationPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtraBonus)) return false;
        ExtraBonus bonus = (ExtraBonus) o;
        return Objects.equals(id, bonus.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
