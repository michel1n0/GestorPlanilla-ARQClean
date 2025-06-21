package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.annual_labor_parameters;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.generic.DomainException;

public class AnnualLaborParametersException extends DomainException {

    private static final long serialVersionUID = 1L;


    public AnnualLaborParametersException(String message) {
        super(message);
    }

    public AnnualLaborParametersException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnnualLaborParametersException(Throwable cause) {
        super(cause);
    }

    public AnnualLaborParametersException() {
    }

    public AnnualLaborParametersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}