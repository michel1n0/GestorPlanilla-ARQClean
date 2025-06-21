package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.DomainException;

public class PayrollException extends DomainException {

    private static final long serialVersionUID = 1L;


    public PayrollException(String message) {
        super(message);
    }

    public PayrollException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayrollException(Throwable cause) {
        super(cause);
    }

    public PayrollException() {
    }

    public PayrollException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}