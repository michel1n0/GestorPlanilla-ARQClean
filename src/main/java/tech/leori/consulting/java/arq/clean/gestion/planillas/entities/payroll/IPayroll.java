package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentConcept;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

public interface IPayroll {
    Long getId();
    Employee getEmployee();
    PaymentPeriod getPeriod();
    List<PaymentConcept> paymentConcepts();

    BigDecimal netSalary();
    BigDecimal getTotalIncome();
    BigDecimal getTotalDeductions();
    BigDecimal getEmployerContribution();
}
