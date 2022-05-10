package de.clean.architecture.fahrzeugbewertung.decorator.domain.model;

public class Fahrzeugwert {
    private final Double wert;
    private final FahrzeugwertBezeichnung bezeichnung;

    public Fahrzeugwert(Double wert, FahrzeugwertBezeichnung bezeichnung) {
        this.wert = wert;
        this.bezeichnung = bezeichnung;
    }

    public Double getWert() {
        return wert;
    }

    public FahrzeugwertBezeichnung getBezeichnung() {
        return bezeichnung;
    }
}
