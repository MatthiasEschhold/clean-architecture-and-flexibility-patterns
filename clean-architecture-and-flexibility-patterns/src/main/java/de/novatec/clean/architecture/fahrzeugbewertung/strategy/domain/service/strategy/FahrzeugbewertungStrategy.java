package de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.service.strategy;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Nutzertyp;

public interface FahrzeugbewertungStrategy {
    Fahrzeugbewertung calculate(Nutzertyp nutzertyp, Fahrzeug fahrzeug, Double marktwert);
}
