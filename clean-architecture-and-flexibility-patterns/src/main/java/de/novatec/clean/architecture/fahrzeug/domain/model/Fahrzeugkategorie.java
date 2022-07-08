package de.novatec.clean.architecture.fahrzeug.domain.model;

public enum Fahrzeugkategorie {
    KOMPAKTKLASSE("Kompaktklasse"),
    MITTELKLASSE("Mittelklasse"),
    OBERKLASSE("Oberklasse"),
    SPORTKLASSE("Sportklasse"),
    VAN("Van"),
    TRANSPORTER("Transporter");

    private String value;

    Fahrzeugkategorie(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
