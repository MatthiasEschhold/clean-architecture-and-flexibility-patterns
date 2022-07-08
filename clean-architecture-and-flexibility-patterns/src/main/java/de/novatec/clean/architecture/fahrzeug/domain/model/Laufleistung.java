package de.novatec.clean.architecture.fahrzeug.domain.model;

public class Laufleistung {
    private Double stand;
    private String einheit;

    public Double getStand() {
        return stand;
    }

    public void setStand(Double stand) {
        this.stand = stand;
    }

    public String getEinheit() {
        return einheit;
    }

    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }
}
