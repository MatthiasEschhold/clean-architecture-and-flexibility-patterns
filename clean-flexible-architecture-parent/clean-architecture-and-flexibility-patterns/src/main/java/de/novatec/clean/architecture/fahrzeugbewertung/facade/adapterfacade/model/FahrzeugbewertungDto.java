package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model;

public class FahrzeugbewertungDto {

    private final Double wiederbeschaffungswert;
    private final Double haendlerverkaufswert;

    public FahrzeugbewertungDto(Double wiederbeschaffungswert, Double haendlerverkaufswert) {
        this.wiederbeschaffungswert = wiederbeschaffungswert;
        this.haendlerverkaufswert = haendlerverkaufswert;
    }

    public Double getWiederbeschaffungswert() {
        return wiederbeschaffungswert;
    }

    public Double getHaendlerverkaufswert() {
        return haendlerverkaufswert;
    }
}
