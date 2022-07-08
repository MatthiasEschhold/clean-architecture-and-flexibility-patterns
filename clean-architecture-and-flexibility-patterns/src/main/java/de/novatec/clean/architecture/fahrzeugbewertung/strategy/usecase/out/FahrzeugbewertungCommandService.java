package de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Fahrzeugbewertung;

public interface FahrzeugbewertungCommandService {
    Fahrzeugbewertung saveFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);

    Fahrzeugbewertung deleteFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);
}
