package de.clean.architecture.fahrzeugbewertung.decorator.domain.service;

import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Nutzertyp;

public class FahrzeugbewertungCommand {
    private String fahrgestellnummer;
    private Nutzertyp nutzertyp;
    private Fahrzeugbewertung fahrzeugbewertung;

    public FahrzeugbewertungCommand(String fahrgestellnummer, Nutzertyp nutzertyp) {
        this.fahrgestellnummer = fahrgestellnummer;
        this.nutzertyp = nutzertyp;
    }

    public FahrzeugbewertungCommand(Fahrzeugbewertung fahrzeugbewertung) {
        this.fahrzeugbewertung = fahrzeugbewertung;
    }

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public Fahrzeugbewertung getFahrzeugbewertung() {
        return fahrzeugbewertung;
    }

    public Nutzertyp getNutzertyp() {
        return nutzertyp;
    }

    public void setFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung) {
        this.fahrzeugbewertung = fahrzeugbewertung;
    }
}
