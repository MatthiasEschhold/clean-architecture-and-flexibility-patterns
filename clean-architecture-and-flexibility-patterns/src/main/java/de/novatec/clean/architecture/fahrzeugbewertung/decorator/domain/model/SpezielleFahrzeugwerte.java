package de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model;

public class SpezielleFahrzeugwerte {
    private Double haendlerverkaufswert;
    private Double wiederbeschaffungswert;

    public SpezielleFahrzeugwerte(Double haendlerverkaufswert, Double wiederbeschaffungswert) {
        this.haendlerverkaufswert = haendlerverkaufswert;
        this.wiederbeschaffungswert = wiederbeschaffungswert;
    }

    public Double getHaendlerverkaufswert() {
        return haendlerverkaufswert;
    }

    public Double getWiederbeschaffungswert() {
        return wiederbeschaffungswert;
    }
}
