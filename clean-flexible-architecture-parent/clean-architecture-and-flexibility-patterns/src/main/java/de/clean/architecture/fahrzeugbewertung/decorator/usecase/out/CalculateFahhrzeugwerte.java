package de.clean.architecture.fahrzeugbewertung.decorator.usecase.out;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface CalculateFahhrzeugwerte {
    SpezielleFahrzeugwerte calculate(Nutzertyp nutzertyp, Fahrzeug fahrzeug);
}
