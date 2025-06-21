package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.output.employee;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;

import java.util.Optional;

@FunctionalInterface
public interface GetEmployeeByIdGateway {
    Optional<Employee> findById(Long id);
}
