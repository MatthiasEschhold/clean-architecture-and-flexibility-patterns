package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug;

public class Fahrgestellnummer {
    private String value;

    public Fahrgestellnummer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
