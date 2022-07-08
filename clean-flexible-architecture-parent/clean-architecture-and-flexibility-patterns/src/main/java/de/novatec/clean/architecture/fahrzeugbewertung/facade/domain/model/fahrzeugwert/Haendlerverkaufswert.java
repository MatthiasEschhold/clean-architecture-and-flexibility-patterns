package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert;

public class Haendlerverkaufswert {
    private Double value;

    public Haendlerverkaufswert(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
