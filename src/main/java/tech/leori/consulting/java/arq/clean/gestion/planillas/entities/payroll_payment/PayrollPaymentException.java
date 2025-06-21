package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll_payment;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.DomainException;

public class PayrollPaymentException extends DomainException {

    private static final long serialVersionUID = 1L;


    public PayrollPaymentException(String message) {
        super(message);
    }

    public PayrollPaymentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayrollPaymentException(Throwable cause) {
        super(cause);
    }

    public PayrollPaymentException() {
    }

    public PayrollPaymentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}