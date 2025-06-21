package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.vacation;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.time.LocalDate;
import java.util.UUID;

public class VacationFactoryImpl implements VacationFactory{
    @Override
    public Vacation create(Employee employee, LocalDate startDate, LocalDate endDate, PaymentPeriod grantedPeriod) throws VacationException {
        if(employee == null) {
            throw new VacationException("Empleado no puede ser nulo");
        }

        if(startDate == null || endDate == null || startDate.isAfter(endDate)) {
            throw new VacationException("Fechas de vacaciones inválidas");
        }

        return new Vacation.Builder()
                .id(UUID.randomUUID().toString())
                .employeeId(employee.getId())
                .startDate(startDate)
                .endDate(endDate)
                .grantedPeriod(grantedPeriod)
                .build();
    }
}
