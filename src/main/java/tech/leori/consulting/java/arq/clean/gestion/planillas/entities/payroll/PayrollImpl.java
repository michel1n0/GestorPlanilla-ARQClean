package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.GenericDomain;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.Amount;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentConcept;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

public class PayrollImpl extends GenericDomain implements IPayroll {

    private Long id;
    private Employee employee;
    private PaymentPeriod period;
    private List<PaymentConcept> paymentConcepts;

    private Amount netSalary;
    private Amount totalIncome;
    private Amount totalDeductions;
    private Amount employerContribution;

    public PayrollImpl(Employee employee, PaymentPeriod period, List<PaymentConcept> paymentConcepts) {

        this.employee = employee;
        this.period = period;
        this.paymentConcepts = paymentConcepts;
    }

    public PayrollImpl(Employee employee, PaymentPeriod period, List<PaymentConcept> paymentConcepts, Amount netSalary) {

        this.employee = employee;
        this.period = period;
        this.paymentConcepts = paymentConcepts;
        this.netSalary = netSalary;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Employee getEmployee() {
        return this.employee;
    }

    @Override
    public PaymentPeriod getPeriod() {
        return this.period;
    }

    @Override
    public List<PaymentConcept> paymentConcepts() {
        return this.paymentConcepts;
    }

    @Override
    public Amount netSalary() {
        return this.netSalary;
    }

    @Override
    public Amount getTotalIncome() {
        return this.totalIncome;
    }

    @Override
    public Amount getTotalDeductions() {
        return this.totalDeductions;
    }

    @Override
    public Amount getEmployerContribution() {
        return this.employerContribution;
    }
}
