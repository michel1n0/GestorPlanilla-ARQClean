package tech.leori.consulting.java.arq.clean.gestion.planillas.usecases.dto.response;

public record SaveEmployeeResponseGateway(
        Long employeeId,
        String fullName
) {
}
