package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert;

public class Wiederbeschaffungswert {
    private Double value;

    public Wiederbeschaffungswert(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
