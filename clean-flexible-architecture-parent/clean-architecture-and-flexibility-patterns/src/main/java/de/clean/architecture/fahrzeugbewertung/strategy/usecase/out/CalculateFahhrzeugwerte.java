package de.clean.architecture.fahrzeugbewertung.strategy.usecase.out;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.SpezielleFahrzeugwerte;

public interface CalculateFahhrzeugwerte {
    SpezielleFahrzeugwerte calculate(Nutzertyp nutzertyp, Fahrzeug fahrzeug);
}
