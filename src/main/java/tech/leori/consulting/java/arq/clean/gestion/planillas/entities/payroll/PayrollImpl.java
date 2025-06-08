package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.GenericDomain;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.paymentConcept.PaymentConcept;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

public class PayrollImpl extends GenericDomain implements IPayroll {

    private Long id;
    private Employee employee;
    private YearMonth period;
    private List<PaymentConcept> paymentConcepts;

    private BigDecimal netSalary;
    private BigDecimal totalIncome;
    private BigDecimal totalDeductions;
    private BigDecimal employerContribution;

    public PayrollImpl(Employee employee, YearMonth period, List<PaymentConcept> paymentConcepts) {

        this.employee = employee;
        this.period = period;
        this.paymentConcepts = paymentConcepts;
    }

    public PayrollImpl(Employee employee, YearMonth period, List<PaymentConcept> paymentConcepts, BigDecimal netSalary) {

        this.employee = employee;
        this.period = period;
        this.paymentConcepts = paymentConcepts;
        this.netSalary = netSalary;
    }

    @Override
    public Employee getEmployee() {
        return this.employee;
    }

    @Override
    public YearMonth getPeriod() {
        return this.period;
    }

    @Override
    public List<PaymentConcept> paymentConcepts() {
        return this.paymentConcepts;
    }

    @Override
    public BigDecimal netSalary() {
        return this.netSalary;
    }

    @Override
    public BigDecimal getTotalIncome() {
        return this.totalIncome;
    }

    @Override
    public BigDecimal getTotalDeductions() {
        return this.totalDeductions;
    }

    @Override
    public BigDecimal getEmployerContribution() {
        return this.employerContribution;
    }
}
