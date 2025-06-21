package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.annual_labor_parameters;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.Amount;

import java.math.BigDecimal;
import java.util.Objects;

public class AnnualLaborParameters {
    private final int fiscalYear;
    private final Amount annualUit;
    private final Amount minimumWage;
    private final BigDecimal essaludPercentage;
    private final BigDecimal familyAllowancePercentage;
    private final BigDecimal ctsPercentage;
    private final BigDecimal onpPercentage;
    private final BigDecimal afpPercentage;

    private AnnualLaborParameters(Builder builder) {
        this.fiscalYear = builder.fiscalYear;
        this.annualUit = builder.annualUit;
        this.minimumWage = builder.minimumWage;
        this.essaludPercentage = builder.essaludPercentage;
        this.familyAllowancePercentage = builder.familyAllowancePercentage;
        this.ctsPercentage = builder.ctsPercentage;
        this.onpPercentage = builder.onpPercentage;
        this.afpPercentage = builder.afpPercentage;
    }

    public static class Builder {
        private int fiscalYear;
        private Amount annualUit;
        private Amount minimumWage;
        private BigDecimal essaludPercentage;
        private BigDecimal familyAllowancePercentage;
        private BigDecimal ctsPercentage;
        private BigDecimal onpPercentage;
        private BigDecimal afpPercentage;

        public Builder fiscalYear(int fiscalYear) {
            this.fiscalYear = fiscalYear;
            return this;
        }

        public Builder annualUit(Amount annualUit) {
            this.annualUit = annualUit;
            return this;
        }

        public Builder minimumWage(Amount minimumWage) {
            this.minimumWage = minimumWage;
            return this;
        }

        public Builder essaludPercentage(BigDecimal essaludPercentage) {
            this.essaludPercentage = essaludPercentage;
            return this;
        }

        public Builder familyAllowancePercentage(BigDecimal familyAllowancePercentage) {
            this.familyAllowancePercentage = familyAllowancePercentage;
            return this;
        }

        public Builder ctsPercentage(BigDecimal ctsPercentage) {
            this.ctsPercentage = ctsPercentage;
            return this;
        }

        public Builder onpPercentage(BigDecimal onpPercentage) {
            this.onpPercentage = onpPercentage;
            return this;
        }

        public Builder afpPercentage(BigDecimal afpPercentage) {
            this.afpPercentage = afpPercentage;
            return this;
        }

        public AnnualLaborParameters build() throws AnnualLaborParametersException {
            if (annualUit == null || minimumWage == null || essaludPercentage == null || familyAllowancePercentage == null ||
                    ctsPercentage == null || onpPercentage == null || afpPercentage == null) {
                throw new AnnualLaborParametersException("Todos los parámetros deben estar definidos.");
            }
            return new AnnualLaborParameters(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnnualLaborParameters)) return false;
        AnnualLaborParameters that = (AnnualLaborParameters) o;
        return fiscalYear == that.fiscalYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fiscalYear);
    }

}
