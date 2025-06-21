package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions;

public class PayrollUseCaseException extends UseCaseException {

    private static final long serialVersionUID = 1L;

    public PayrollUseCaseException() {

    }

    public PayrollUseCaseException(String message) {
        super(message);
    }

    public PayrollUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayrollUseCaseException(Throwable cause) {
        super(cause);
    }

    public PayrollUseCaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
