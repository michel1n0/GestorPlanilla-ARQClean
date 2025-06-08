package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.payrollPayment;

public enum PayState {
    PENDING(1, "Pending"),
    APPROVED(2, "Approved"),
    REJECTED(3, "Rejected"),
    PAID(4, "Paid"),
    CANCELLED(5, "Cancelled");

    private Integer index;
    private String value;

    PayState(Integer index, String value) {
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
}
