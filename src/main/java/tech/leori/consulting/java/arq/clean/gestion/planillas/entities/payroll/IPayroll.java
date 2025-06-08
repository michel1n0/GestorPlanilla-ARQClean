package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.paymentConcept.PaymentConcept;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

public interface IPayroll {
    Employee getEmployee();
    YearMonth getPeriod();
    List<PaymentConcept> paymentConcepts();

    BigDecimal netSalary();
    BigDecimal getTotalIncome();
    BigDecimal getTotalDeductions();
    BigDecimal getEmployerContribution();
}
