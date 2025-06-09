package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.DomainException;

public class EmployeeException extends DomainException {

    private static final long serialVersionUID = 1L;


    public EmployeeException(String message) {
        super(message);
    }

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeException(Throwable cause) {
        super(cause);
    }

    public EmployeeException() {
    }

    public EmployeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}