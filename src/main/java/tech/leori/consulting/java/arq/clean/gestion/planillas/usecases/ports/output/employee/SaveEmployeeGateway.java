package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.output.employee;

import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.SaveEmployeeRequestGateway;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.response.SaveEmployeeResponseGateway;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions.EmployeeUseCaseException;

@FunctionalInterface
public interface SaveEmployeeGateway {
    Long save(SaveEmployeeRequestGateway saveEmployeeRequestGateway) throws EmployeeUseCaseException;
}
