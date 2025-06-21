package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.input.employee;

import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.UpdateSalaryRequestDTO;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions.EmployeeUseCaseException;

@FunctionalInterface
public interface UpdateSalaryUseCase {
    Long updateSalary(UpdateSalaryRequestDTO updateSalaryRequestDTO) throws EmployeeUseCaseException;
}
