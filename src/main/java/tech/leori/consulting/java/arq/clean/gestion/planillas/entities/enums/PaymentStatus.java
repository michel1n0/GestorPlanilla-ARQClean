package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums;

public enum PaymentStatus {
    PENDING(1, "PENDIENTE"),
    PAID(2, "PAGADO"),
    FAILED(3, "FALLO"),;

    private Integer index;
    private String value;

    private PaymentStatus(Integer index, String value) {
        this.index = index;
        this.value = value;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PaymentStatus getDefault() {
        return PENDING;
    }
}
