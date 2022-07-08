package de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeugbewertung {
    private Long bewertungsnummer;
    private List<Fahrzeugwert> fahrzeugwerte;
    private final Fahrzeug fahrzeug;
    private final Nutzertyp nutzertyp;


    public Fahrzeugbewertung(Fahrzeug fahrzeug, Fahrzeugwert marktwert, Nutzertyp nutzertyp) {
        this.fahrzeugwerte = new ArrayList<>();
        this.fahrzeugwerte.add(marktwert);
        this.fahrzeug = fahrzeug;
        this.nutzertyp = nutzertyp;
    }

    public Nutzertyp getNutzertyp() {
        return nutzertyp;
    }

    public List<Fahrzeugwert> getFahrzeugwerte() {
        return fahrzeugwerte;
    }

    public void addFahrzeugwert(Double wert, FahrzeugwertBezeichnung fahrzeugwertBezeichnung) {
        this.fahrzeugwerte.add(new Fahrzeugwert(wert, fahrzeugwertBezeichnung));
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    public Long getBewertungsnummer() {
        return bewertungsnummer;
    }

    public void setBewertungsnummer(Long bewertungsnummer) {
        this.bewertungsnummer = bewertungsnummer;
    }
}
