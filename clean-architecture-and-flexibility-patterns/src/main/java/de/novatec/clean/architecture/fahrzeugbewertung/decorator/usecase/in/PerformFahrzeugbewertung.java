package de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.in;

import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.service.FahrzeugbewertungCommand;

public interface PerformFahrzeugbewertung {
    Fahrzeugbewertung perform(FahrzeugbewertungCommand fahrzeugbewertungCommand);
}
