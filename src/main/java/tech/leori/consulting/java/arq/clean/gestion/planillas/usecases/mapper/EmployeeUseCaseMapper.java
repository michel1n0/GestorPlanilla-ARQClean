package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.mapper;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.SaveEmployeeRequestGateway;

public interface EmployeeUseCaseMapper {

    SaveEmployeeRequestGateway toGateway(Employee employee);
}
