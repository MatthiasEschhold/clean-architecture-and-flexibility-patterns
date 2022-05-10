package de.clean.architecture.fahrzeug.domain.model;

import java.util.Objects;

public class Fahrzeug {
    private String fahrgestellnummer;
    private Laufleistung laufleistung;
    private Fahrzeugkategorie fahrzeugkategorie;
    private Fahrzeugmodell fahrzeugmodell;

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public Fahrzeugkategorie getFahrzeugkategorie() {
        return fahrzeugkategorie;
    }

    public Fahrzeugmodell getFahrzeugmodell() {
        return fahrzeugmodell;
    }

    public void setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public Laufleistung getLaufleistung() {
        return laufleistung;
    }

    public void setLaufleistung(Laufleistung laufleistung) {
        this.laufleistung = laufleistung;
    }

    public void setFahrzeugkategorie(Fahrzeugkategorie fahrzeugkategorie) {
        this.fahrzeugkategorie = fahrzeugkategorie;
    }

    public void setFahrzeugmodell(Fahrzeugmodell fahrzeugmodell) {
        this.fahrzeugmodell = fahrzeugmodell;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return Objects.equals(fahrgestellnummer, fahrzeug.fahrgestellnummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fahrgestellnummer);
    }
}
