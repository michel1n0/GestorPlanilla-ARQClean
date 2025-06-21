package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.input.employee;

import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.SaveEmployeeRequestDTO;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.response.SaveEmployeeResponseDTO;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions.EmployeeUseCaseException;

//Inteface Segregation Principle (ISP)
@FunctionalInterface
public interface SaveEmployeeUseCase {
    Long save(SaveEmployeeRequestDTO saveEmployeeRequestDTO) throws EmployeeUseCaseException;
}
