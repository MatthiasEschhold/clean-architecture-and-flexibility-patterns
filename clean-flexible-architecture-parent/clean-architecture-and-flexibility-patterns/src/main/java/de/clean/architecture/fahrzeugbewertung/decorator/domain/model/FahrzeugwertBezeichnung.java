package de.clean.architecture.fahrzeugbewertung.decorator.domain.model;

public enum FahrzeugwertBezeichnung {
    MARKTWERT("Marktpreis"),
    WIEDERBESCHAFFUNGSWERT("Wiederbeschaffungswert"),
    ZEITWERT("Zeitwert"),
    HAENDLERVERKAUFSWERT("Haendlerverkaufswert"),
    GESCHAETZTER_ANGEBOTSPREIS("GESCHAETZTER_ANGEBOTSPREIS");

    String value;

    FahrzeugwertBezeichnung(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
