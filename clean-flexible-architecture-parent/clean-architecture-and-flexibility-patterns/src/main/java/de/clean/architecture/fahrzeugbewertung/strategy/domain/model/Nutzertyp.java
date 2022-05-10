package de.clean.architecture.fahrzeugbewertung.strategy.domain.model;

public enum Nutzertyp {
    INTERESSENT_IN("INTERESSENT_IN"), AUTOMOBILVERKAEUFER_IN("AUTOMOBILVERKAUEFER_IN");

    private String value;

    Nutzertyp(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
