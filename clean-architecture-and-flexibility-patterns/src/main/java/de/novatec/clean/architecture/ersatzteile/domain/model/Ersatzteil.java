package de.novatec.clean.architecture.ersatzteile.domain.model;

public class Ersatzteil {
    private String ersatzteilenummer;
    private ErsatzteilKategorie kategorie;
    private Double verkaufspreis;

    public Ersatzteil(String ersatzteilenummer, ErsatzteilKategorie kategorie, Double verkaufspreis) {
        this.ersatzteilenummer = ersatzteilenummer;
        this.kategorie = kategorie;
        this.verkaufspreis = verkaufspreis;
    }

    public String getErsatzteilenummer() {
        return ersatzteilenummer;
    }

    public ErsatzteilKategorie getKategorie() {
        return kategorie;
    }

    public Double getVerkaufspreis() {
        return verkaufspreis;
    }
}
