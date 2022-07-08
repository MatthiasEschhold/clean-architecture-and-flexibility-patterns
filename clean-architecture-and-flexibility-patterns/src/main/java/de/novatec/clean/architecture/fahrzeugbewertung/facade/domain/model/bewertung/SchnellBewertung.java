package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Marktwert;

public class SchnellBewertung extends Fahrzeugbewertung {

    private Marktwert korrigierterMarktwert;

    public SchnellBewertung(MangelReduktionsfaktor mangelReduktionsfaktor, Fahrzeug fahrzeug) {
        super(mangelReduktionsfaktor, fahrzeug);
    }

    public Marktwert getKorrigierterMarktwert() {
        return korrigierterMarktwert;
    }

    public void setKorrigierterMarktwert(Marktwert korrigierterMarktwert) {
        this.korrigierterMarktwert = korrigierterMarktwert;
    }
}
