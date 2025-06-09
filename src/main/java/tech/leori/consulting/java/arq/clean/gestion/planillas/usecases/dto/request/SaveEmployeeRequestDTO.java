package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request;

import tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums.PensionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public record SaveEmployeeRequestDTO(
         String name,
         String lastName,
         LocalDate birthDate,
         LocalDate entryDate,
         LocalDate exitDate,
         BigDecimal baseSalary,
         PensionType pensionType,
         boolean haveInsurance
) {
}
