package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung;

public class MangelReduktionsfaktor {
    private final Double value;

    public MangelReduktionsfaktor(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
