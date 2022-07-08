package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Haendlerverkaufswert;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Wiederbeschaffungswert;

public class ExakteBewertung extends Fahrzeugbewertung {

    private Haendlerverkaufswert haendlerverkaufswert;
    private Wiederbeschaffungswert wiederbeschaffungswert;
    private final Fahrzeugzustand fahrzeugzustand;
    private final NachfrageReduktionsfaktor nachfrageReduktionsfaktor;

    public ExakteBewertung(MangelReduktionsfaktor mangelReduktionsfaktor,
                           NachfrageReduktionsfaktor nachfrageReduktionsfaktor,
                           Fahrzeug fahrzeug,
                           Fahrzeugzustand fahrzeugzustand) {
        super(mangelReduktionsfaktor, fahrzeug);
        this.fahrzeugzustand = fahrzeugzustand;
        this.nachfrageReduktionsfaktor = nachfrageReduktionsfaktor;
    }

    public Haendlerverkaufswert getHaendlerverkaufswert() {
        return haendlerverkaufswert;
    }

    public void setHaendlerverkaufswert(Haendlerverkaufswert haendlerverkaufswert) {
        this.haendlerverkaufswert = haendlerverkaufswert;
    }

    public Wiederbeschaffungswert getWiederbeschaffungswert() {
        return wiederbeschaffungswert;
    }

    public void setWiederbeschaffungswert(Wiederbeschaffungswert wiederbeschaffungswert) {
        this.wiederbeschaffungswert = wiederbeschaffungswert;
    }

    public Fahrzeugzustand getFahrzeugzustand() {
        return fahrzeugzustand;
    }

    public NachfrageReduktionsfaktor getNachfrageReduktionsfaktor() {
        return nachfrageReduktionsfaktor;
    }
}
