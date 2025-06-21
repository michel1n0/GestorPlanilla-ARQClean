package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.mapper;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PensionType;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.SaveEmployeeRequestGateway;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeUseCaseMapperImpl implements EmployeeUseCaseMapper {


    @Override
    public SaveEmployeeRequestGateway toGateway(Employee employee) {
        return new SaveEmployeeRequestGateway(
                employee.getName(),
                employee.getLastName(),
                employee.getBirthDate(),
                employee.getEntryDate(),
                employee.getBaseSalary().getValue(),
                employee.getBaseSalary().getCurrency().getCurrencyCode(),
                employee.getPensionType(),
                employee.isHaveInsurance()
        );
    }
}

