package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PensionType;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.GenericDomain;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.Amount;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Employee extends GenericDomain {

    private Long id;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private LocalDate entryDate;
    private LocalDate exitDate;
    private Amount baseSalary;
    private PensionType pensionType;
    private boolean haveInsurance;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.birthDate = builder.birthDate;
        this.entryDate = builder.entryDate;
        this.exitDate = builder.exitDate;
        this.baseSalary = builder.baseSalary;
        this.pensionType = builder.pensionType;
        this.haveInsurance = builder.haveInsurance;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String lastName;
        private LocalDate birthDate;
        private LocalDate entryDate;
        private LocalDate exitDate;
        private Amount baseSalary;
        private PensionType pensionType;
        private boolean haveInsurance;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder entryDate(LocalDate entryDate) {
            this.entryDate = entryDate;
            return this;
        }

        public Builder exitDate(LocalDate exitDate) {
            this.exitDate = exitDate;
            return this;
        }

        public Builder baseSalary(Amount baseSalary) {
            this.baseSalary = baseSalary;
            return this;
        }

        public Builder pensionType(PensionType pensionType) {
            this.pensionType = pensionType;
            return this;
        }

        public Builder haveInsurance(boolean haveInsurance) {
            this.haveInsurance = haveInsurance;
            return this;
        }

        public Employee build() throws EmployeeException {
            if(id == null || name == null || lastName == null || entryDate == null || baseSalary == null || pensionType == null) {
                throw new EmployeeException("Campos obligatorios son requeridos");
            }

            if (baseSalary.getValue().compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("El sueldo base debe ser mayor a cero.");
            }

            if (exitDate != null && exitDate.isBefore(entryDate)) {
                throw new EmployeeException("La fecha de salida no puede ser anterior a la de ingreso");
            }


            return new Employee(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public LocalDate getExitDate() {
        return exitDate;
    }

    public Amount getBaseSalary() {
        return baseSalary;
    }

    public PensionType getPensionType() {
        return pensionType;
    }

    public boolean isHaveInsurance() {
        return haveInsurance;
    }

    public int getYearsOfService() {
        return Period.between(entryDate, LocalDate.now()).getYears();
    }

    public boolean isEligibleForCts() {
        return getYearsOfService() >= 1 && exitDate == null;
    }

    public boolean hasActiveContract() {
        return exitDate == null || exitDate.isAfter(LocalDate.now());
    }

    public void updateSalary(Amount newSalary) throws EmployeeException {
        if (newSalary.getValue().compareTo(BigDecimal.ZERO) <= 0) {
            throw new EmployeeException("Sueldo inválido");
        }
        //TODO: Implementar lógica para registrar el cambio de sueldo en el historial laboral
        // HistorialLaboralFactory.logCambio("baseSalary", this.baseSalary, newSalary);
        this.baseSalary = newSalary;
    }


}
