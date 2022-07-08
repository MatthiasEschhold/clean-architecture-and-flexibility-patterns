package de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Nutzertyp;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.SpezielleFahrzeugwerte;

public interface CalculateFahhrzeugwerte {
    SpezielleFahrzeugwerte calculate(Nutzertyp nutzertyp, Fahrzeug fahrzeug);
}
