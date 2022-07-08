package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung;

public class NachfrageReduktionsfaktor {
    private final Double value;

    public NachfrageReduktionsfaktor(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
