package de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbesitzer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Marktwert;

public interface CreateFahrzeugbewertung {
    Fahrzeugbewertung create(Fahrzeugbesitzer besitzer, Fahrzeug fahrzeug, Marktwert marktwert);
}
