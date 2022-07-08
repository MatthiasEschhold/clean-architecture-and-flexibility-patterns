package de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model;

public enum Nutzertyp {
    INTERESSENT_IN("INTERESSENT_IN"), AUTOMOBILVERKAEUFER_IN("AUTOMOBILVERKAUEFER_IN"), GUTACHTER_IN("GUTACHTER_IN");

    private String value;

    Nutzertyp(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
