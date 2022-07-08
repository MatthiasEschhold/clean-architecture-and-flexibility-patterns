package de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;

public interface FahrzeugbewertungCommandService {
    Fahrzeugbewertung saveFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);

    Fahrzeugbewertung deleteFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);
}
