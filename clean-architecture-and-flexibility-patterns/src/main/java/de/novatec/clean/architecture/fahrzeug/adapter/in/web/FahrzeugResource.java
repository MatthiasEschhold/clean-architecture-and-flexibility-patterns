package de.novatec.clean.architecture.fahrzeug.adapter.in.web;

public class FahrzeugResource {
    private String fahrgestellnummer;
    private String modellbezeichnung;
    private String modellnummer;
    private String kategorie;
    private Double kilometerstand;

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getModellbezeichnung() {
        return modellbezeichnung;
    }

    public void setModellbezeichnung(String modellbezeichnung) {
        this.modellbezeichnung = modellbezeichnung;
    }

    public String getModellnummer() {
        return modellnummer;
    }

    public void setModellnummer(String modellnummer) {
        this.modellnummer = modellnummer;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public Double getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(Double kilometerstand) {
        this.kilometerstand = kilometerstand;
    }
}
