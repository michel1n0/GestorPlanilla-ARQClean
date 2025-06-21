package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.vacation;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.DomainException;

public class VacationException extends DomainException {

    private static final long serialVersionUID = 1L;


    public VacationException(String message) {
        super(message);
    }

    public VacationException(String message, Throwable cause) {
        super(message, cause);
    }

    public VacationException(Throwable cause) {
        super(cause);
    }

    public VacationException() {
    }

    public VacationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}