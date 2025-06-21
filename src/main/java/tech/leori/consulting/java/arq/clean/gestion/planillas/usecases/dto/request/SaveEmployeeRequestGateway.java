package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PensionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public record SaveEmployeeRequestGateway(
         String name,
         String lastName,
         LocalDate birthDate,
         LocalDate entryDate,
         BigDecimal baseSalary,
         String Currency,
         PensionType pensionType,
         boolean haveInsurance
) {
}
