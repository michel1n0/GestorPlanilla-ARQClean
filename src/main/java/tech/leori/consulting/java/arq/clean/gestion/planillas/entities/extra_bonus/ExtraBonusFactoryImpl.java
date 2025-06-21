package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.extra_bonus;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ExtraBonusFactoryImpl implements ExtraBonusFactory {

    @Override
    public ExtraBonus create(Employee employee, BigDecimal amount, String description, PaymentPeriod applicationPeriod) throws ExtraBonusException {
        if (employee == null || amount == null || amount.compareTo(BigDecimal.ZERO) <= 0 || description == null) {
            throw new ExtraBonusException("Parámetros inválidos para crear bono.");
        }

        if (applicationPeriod == null) {
            throw new ExtraBonusException("Periodo de aplicación no puede ser nulo.");
        }

        if (description == null || description.isBlank()) {
            throw new ExtraBonusException("La descripción no puede estar vacía.");
        }

        return new ExtraBonus.Builder()
                .employeeId(employee.getId())
                .amount(amount)
                .description(description)
                .grantedDate(LocalDate.now())
                .applicationPeriod(applicationPeriod)
                .build();
    }
}
