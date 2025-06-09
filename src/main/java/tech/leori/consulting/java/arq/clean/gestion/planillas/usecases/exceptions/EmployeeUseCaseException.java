package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions;

public class EmployeeUseCaseException extends UseCaseException {

    private static final long serialVersionUID = 1L;

    public EmployeeUseCaseException() {

    }

    public EmployeeUseCaseException(String message) {
        super(message);
    }

    public EmployeeUseCaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeUseCaseException(Throwable cause) {
        super(cause);
    }

    public EmployeeUseCaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
