package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model;

public class FahrzeugbesitzerDto {
    private final String name;
    private final String vorname;

    public FahrzeugbesitzerDto(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }
}
