package de.clean.architecture.fahrzeugbewertung.strategy.usecase.in;

import de.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.facade.domain.model.nutzertyp.Nutzertyp;

public interface CalculateFahrzeugbewertung {
    Fahrzeugbewertung calculate(Nutzertyp nutzertyp, String fahrgestellnummer);
}
