package de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Nutzertyp;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.SpezielleFahrzeugwerte;

public interface CalculateFahrzeugwerte {
    SpezielleFahrzeugwerte calculate(Nutzertyp nutzertyp, Fahrzeug fahrzeug);
}
