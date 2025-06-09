package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.input.payroll;

import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions.PayrollUseCaseException;

//Interface Segregation Principle (ISP) compliant interface for saving payrolls
@FunctionalInterface
public interface PayrollSaveUseCase {
    Long save() throws PayrollUseCaseException;
}
