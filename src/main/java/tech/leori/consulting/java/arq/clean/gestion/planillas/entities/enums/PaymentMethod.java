package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums;

public enum PaymentMethod {
    AFP(1, "AFP"),
    ONP(2, "ONP");

    private Integer index;
    private String value;

    private PaymentMethod(Integer index, String value) {
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

    public static PaymentMethod getDefault() {
        return ONP;
    }
}
