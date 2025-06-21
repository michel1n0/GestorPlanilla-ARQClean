package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.interactors;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.EmployeeException;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.Amount;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.SaveEmployeeRequestDTO;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.SaveEmployeeRequestGateway;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request.UpdateSalaryRequestDTO;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.exceptions.EmployeeUseCaseException;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.mapper.EmployeeUseCaseMapper;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.input.employee.SaveEmployeeUseCase;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.input.employee.UpdateSalaryUseCase;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.output.employee.GetEmployeeByIdGateway;
import tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.ports.output.employee.SaveEmployeeGateway;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class EmployeeInteractor
        extends
        GenericInteractor
        implements
        SaveEmployeeUseCase,
        UpdateSalaryUseCase {

    private final EmployeeUseCaseMapper employeeUseCaseMapper;
    private final SaveEmployeeGateway saveEmployeeGateway;
    private final GetEmployeeByIdGateway getEmployeeByIdGateway;

    public EmployeeInteractor(
            final SaveEmployeeRequestGateway saveEmployeeRequestGateway,
            final Employee employee,
            final EmployeeUseCaseMapper employeeUseCaseMapper,
            final SaveEmployeeGateway saveEmployeeGateway,
            final GetEmployeeByIdGateway getEmployeeByIdGateway
    ) {
        this.employeeUseCaseMapper = employeeUseCaseMapper;
        this.saveEmployeeGateway = saveEmployeeGateway;
        this.getEmployeeByIdGateway = getEmployeeByIdGateway;
    }

    @Override
    public Long save(SaveEmployeeRequestDTO request) throws EmployeeUseCaseException {
        try {

            Amount baseSalary = new Amount(request.baseSalary(), Currency.getInstance(request.currency()));

            Employee employee = new Employee.Builder()
                    .id(UUID.randomUUID().timestamp())
                    .name(request.name())
                    .lastName(request.lastName())
                    .birthDate(request.birthDate())
                    .entryDate(request.entryDate())
                    .baseSalary(baseSalary)
                    .pensionType(request.pensionType())
                    .haveInsurance(request.haveInsurance())
                    .build();

            return saveEmployeeGateway.save(employeeUseCaseMapper.toGateway(employee));
        } catch (EmployeeException e) {
            throw new EmployeeUseCaseException("Error saving employee", e);
        }
    }

    @Override
    public Long updateSalary(UpdateSalaryRequestDTO request) throws EmployeeUseCaseException {
        try {
            Employee employee = getEmployeeByIdGateway.findById(request.EmployeeId())
                    .orElseThrow(() -> new EmployeeException("Empleado no encontrado"));

            Amount newSalary = toAmount(request.newAmount(), request.currency());

            employee.updateSalary(newSalary);

            return saveEmployeeGateway.save(employeeUseCaseMapper.toGateway(employee));
        } catch (EmployeeException e) {
            throw new EmployeeUseCaseException("Error updating employee salary", e);
        }
    }

    private Amount toAmount(BigDecimal value, String currencyCode) {
        return new Amount(value, Currency.getInstance(currencyCode));
    }

}
