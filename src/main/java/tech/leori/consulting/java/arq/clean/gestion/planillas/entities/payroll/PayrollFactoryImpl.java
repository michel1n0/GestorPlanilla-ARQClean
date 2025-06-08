package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.paymentConcept.PaymentConcept;
import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.List;

import static java.util.Objects.isNull;
import static tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll.Constants.NEGATIVE_NET_SALARY_ERROR;
import static tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll.Constants.NULL_EMPLOYEE_ERROR;
import static tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll.Constants.NULL_PAYMENT_CONCEPTS_ERROR;
import static tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll.Constants.NULL_PERIOD_ERROR;

public class PayrollFactoryImpl implements PayrollFactory {



    private final int FLAG_SALARY = 0;

    @Override
    public IPayroll create(Employee employee, YearMonth period, List<PaymentConcept> paymentConcepts, BigDecimal netSalary) throws PayrollException {

        this.validate(employee, period, paymentConcepts, netSalary);
        return new PayrollImpl(employee, period, paymentConcepts, netSalary);
    }

    @Override
    public IPayroll create(Employee employee, YearMonth period, List<PaymentConcept> paymentConcepts) throws PayrollException {

        BigDecimal netSalary = BigDecimal.ZERO;
        this.validate(employee, period, paymentConcepts, netSalary);
        return new PayrollImpl(employee, period, paymentConcepts, netSalary);
    }

    private void validate(Employee employee, YearMonth period, List<PaymentConcept> paymentConcepts, BigDecimal netSalary) throws PayrollException {
        if (netSalary.compareTo(BigDecimal.ZERO) < FLAG_SALARY) {
            throw new PayrollException(NEGATIVE_NET_SALARY_ERROR);
        }
        if (isNull(paymentConcepts) || paymentConcepts.isEmpty()) {
            throw new PayrollException(NULL_PAYMENT_CONCEPTS_ERROR);
        }
        if (isNull(employee)) {
            throw new PayrollException(NULL_EMPLOYEE_ERROR);
        }
        if (isNull(period)) {
            throw new PayrollException(NULL_PERIOD_ERROR);
        }
    }
}
