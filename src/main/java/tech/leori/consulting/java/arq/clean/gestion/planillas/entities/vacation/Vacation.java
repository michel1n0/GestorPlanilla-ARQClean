package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.vacation;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.GenericDomain;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.time.LocalDate;

public class Vacation extends GenericDomain {
    private static final long serialVersionUID = 1L;

    private final String id;
    private final Long employeeId;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final PaymentPeriod grantedPeriod;

    public Vacation(Builder builder) {
        this.id = builder.id;
        this.employeeId = builder.employeeId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.grantedPeriod = builder.grantedPeriod;
    }

    public static class Builder {
        private String id;
        private Long employeeId;
        private LocalDate startDate;
        private LocalDate endDate;
        private PaymentPeriod grantedPeriod;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder employeeId(Long employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder grantedPeriod(PaymentPeriod grantedPeriod) {
            this.grantedPeriod = grantedPeriod;
            return this;
        }

        public Vacation build() {
            if (employeeId == null || startDate == null || endDate == null || grantedPeriod == null) {
                throw new IllegalStateException("Todos los campos de vacaciones son requeridos.");
            }

            if (endDate.isBefore(startDate)) {
                throw new IllegalStateException("La fecha de fin no puede ser anterior a la de inicio.");
            }
            return new Vacation(this);
        }
    }

    public String getId() {
        return id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public PaymentPeriod getGrantedPeriod() {
        return grantedPeriod;
    }
}
