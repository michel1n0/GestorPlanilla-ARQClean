package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.extra_bonus;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.employee.Employee;
import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.valueobject.PaymentPeriod;

import java.math.BigDecimal;

public interface ExtraBonusFactory {
    ExtraBonus create(Employee employee, BigDecimal amount, String description, PaymentPeriod applicationPeriod) throws ExtraBonusException;
}
