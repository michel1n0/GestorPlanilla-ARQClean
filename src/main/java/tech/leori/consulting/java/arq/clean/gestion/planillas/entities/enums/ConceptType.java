package tech.leori.consulting.java.arq.clean.gestion.planillas.entities.enums;

public enum ConceptType {
    INGRESO(1, "INGRESO"),
    DESCUENTO(2, "DESCUENTO"),
    APORTACION(3, "APORTACION");

    private Integer index;
    private String value;

    private ConceptType(Integer index, String value) {
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
