package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.vacation;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.time.LocalDate;

public interface VacationFactory {
    Vacation create(Employee employee, LocalDate startDate, LocalDate endDate, PaymentPeriod grantedPeriod) throws VacationException;
}
