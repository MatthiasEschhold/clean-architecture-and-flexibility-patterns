package de.clean.architecture.fahrzeugbewertung.decorator.usecase.in;

import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.service.FahrzeugbewertungCommand;

public interface PerformFahrzeugbewertung {
    Fahrzeugbewertung perform(FahrzeugbewertungCommand fahrzeugbewertungCommand);
}
