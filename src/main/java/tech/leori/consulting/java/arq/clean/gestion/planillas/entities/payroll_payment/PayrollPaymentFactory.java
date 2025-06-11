package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll_payment;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PaymentMethod;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PaymentStatus;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll.IPayroll;

import java.time.LocalDate;

public interface PayrollPaymentFactory {
    PayrollPayment create(IPayroll payroll, LocalDate paymentDate, PaymentMethod method, PaymentStatus status) throws PayrollPaymentException;
}
