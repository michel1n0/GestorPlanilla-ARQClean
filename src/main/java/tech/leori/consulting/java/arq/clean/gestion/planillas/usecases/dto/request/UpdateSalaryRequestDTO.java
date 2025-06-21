package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.request;

import java.math.BigDecimal;

public record UpdateSalaryRequestDTO(
        Long EmployeeId,
        BigDecimal newAmount,
        String currency
) {
}
