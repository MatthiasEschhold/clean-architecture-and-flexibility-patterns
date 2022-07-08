package de.novatec.clean.architecture.fahrzeugangebot.domain.model;

public class Fahrzeugangebot {
    private Long angebotsnummer;
    private final String fahrgestellnummer;
    private final Fahrzeugstammdaten fahrzeugstammdaten;
    private final Double angebotspreis;

    public Fahrzeugangebot(String fahrgestellnummer, Fahrzeugstammdaten fahrzeugstammdaten, Double angebotspreis) {
        this.fahrgestellnummer = fahrgestellnummer;
        this.fahrzeugstammdaten = fahrzeugstammdaten;
        this.angebotspreis = angebotspreis;
    }

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public Long getAngebotsnummer() {
        return angebotsnummer;
    }

    public void setAngebotsnummer(Long angebotsnummer) {
        this.angebotsnummer = angebotsnummer;
    }

    public Fahrzeugstammdaten getFahrzeugstammdaten() {
        return fahrzeugstammdaten;
    }

    public Double getAngebotspreis() {
        return angebotspreis;
    }
}
