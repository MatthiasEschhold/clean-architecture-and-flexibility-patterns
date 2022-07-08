package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model;

public class FahrzeugbewertungAnlageDto {
    private final String fahrzeugbesitzerName;
    private final String fahrzeugbesitzerVorname;
    private final String fahrgestellnummer;

    public FahrzeugbewertungAnlageDto(String fahrzeugbesitzerName, String fahrzeugbesitzerVorname, String fahrgestellnummer) {
        this.fahrzeugbesitzerName = fahrzeugbesitzerName;
        this.fahrzeugbesitzerVorname = fahrzeugbesitzerVorname;
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getFahrzeugbesitzerName() {
        return fahrzeugbesitzerName;
    }

    public String getFahrzeugbesitzerVorname() {
        return fahrzeugbesitzerVorname;
    }

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }
}
