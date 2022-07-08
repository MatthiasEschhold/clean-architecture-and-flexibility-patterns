package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Marktwert;

public abstract class Fahrzeugbewertung {
    private final MangelReduktionsfaktor mangelReduktionsfaktor;
    private final Fahrzeug fahrzeug;
    private Marktwert marktwert;

    public Fahrzeugbewertung(MangelReduktionsfaktor mangelReduktionsfaktor, Fahrzeug fahrzeug) {
        this.mangelReduktionsfaktor = mangelReduktionsfaktor;
        this.fahrzeug = fahrzeug;
    }

    public MangelReduktionsfaktor getMangelReduktionsfaktor() {
        return mangelReduktionsfaktor;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    public Marktwert getMarktwert() {
        return marktwert;
    }

    public void setMarktwert(Marktwert marktwert) {
        this.marktwert = marktwert;
    }
}
