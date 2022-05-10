package de.clean.architecture.fahrzeugbewertung.strategy.domain.model;

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
