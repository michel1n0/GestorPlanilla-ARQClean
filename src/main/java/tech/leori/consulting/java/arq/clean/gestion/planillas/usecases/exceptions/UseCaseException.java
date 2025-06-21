package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions;

public class UseCaseException extends Exception {

    private static final long serialVersionUID = 1L;

    public UseCaseException() {

    }

    public UseCaseException(String message) {
        super(message);
    }

    public UseCaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public UseCaseException(Throwable cause) {
        super(cause);
    }

    public UseCaseException(String message, Throwable cause, boolean EnableSuppression, boolean writableStackTrace) {
        super(message, cause, EnableSuppression, writableStackTrace);
    }
}
