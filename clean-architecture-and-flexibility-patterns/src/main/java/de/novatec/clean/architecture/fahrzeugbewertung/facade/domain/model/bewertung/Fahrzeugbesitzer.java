package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung;

public class Fahrzeugbesitzer {
    private final String name;
    private final String vorname;

    public Fahrzeugbesitzer(String name, String vorname) {
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
