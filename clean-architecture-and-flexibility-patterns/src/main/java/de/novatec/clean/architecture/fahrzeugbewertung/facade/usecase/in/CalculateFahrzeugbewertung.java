package de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.in;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbesitzer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrgestellnummer;

public interface CalculateFahrzeugbewertung {
    Fahrzeugbewertung calculate(Fahrzeugbesitzer besitzer, Fahrgestellnummer fahrgestellnummer);
}
