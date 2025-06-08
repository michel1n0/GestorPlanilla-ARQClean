package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.paymentConcept.PaymentConcept;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

public interface PayrollFactory {
    IPayroll create(Employee employee, YearMonth period, List<PaymentConcept> paymentConcepts, BigDecimal netSalary) throws PayrollException;

    IPayroll create(Employee employee, YearMonth period, List<PaymentConcept> paymentConcepts) throws PayrollException;
}
