package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert;

public class Marktwert {
    private Double value;

    public Marktwert(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
