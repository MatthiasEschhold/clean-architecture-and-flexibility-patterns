package de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.in;


import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Nutzertyp;

public interface CalculateFahrzeugbewertung {
    Fahrzeugbewertung calculate(Nutzertyp nutzertyp, String fahrgestellnummer);
}
