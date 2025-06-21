package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.extra_bonus;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.DomainException;

public class ExtraBonusException extends DomainException {

    private static final long serialVersionUID = 1L;


    public ExtraBonusException(String message) {
        super(message);
    }

    public ExtraBonusException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExtraBonusException(Throwable cause) {
        super(cause);
    }

    public ExtraBonusException() {
    }

    public ExtraBonusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}