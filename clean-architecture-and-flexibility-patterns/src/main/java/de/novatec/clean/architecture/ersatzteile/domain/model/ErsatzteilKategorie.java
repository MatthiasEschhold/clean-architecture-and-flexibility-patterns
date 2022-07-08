package de.novatec.clean.architecture.ersatzteile.domain.model;

public enum ErsatzteilKategorie  {
    MOTOR("01_MOTOR"),
    BREMSANLAGE_VORNE("02_BREMSANLAGE_VORNE"),
    BREMSANLAGE_HINTEN("03_BREMSANALAGE_HINTEN");

    private String value;

    ErsatzteilKategorie(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
