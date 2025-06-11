package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.Amount;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentConcept;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

public interface PayrollFactory {
    IPayroll create(Employee employee, PaymentPeriod period, List<PaymentConcept> paymentConcepts, Amount netSalary) throws PayrollException;

    IPayroll create(Employee employee, PaymentPeriod period, List<PaymentConcept> paymentConcepts) throws PayrollException;
}
