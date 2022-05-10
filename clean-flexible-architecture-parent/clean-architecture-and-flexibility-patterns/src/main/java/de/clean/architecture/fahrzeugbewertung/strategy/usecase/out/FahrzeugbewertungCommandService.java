package de.clean.architecture.fahrzeugbewertung.strategy.usecase.out;

import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.Fahrzeugbewertung;

public interface FahrzeugbewertungCommandService {
    Fahrzeugbewertung saveFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);

    Fahrzeugbewertung deleteFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);
}
