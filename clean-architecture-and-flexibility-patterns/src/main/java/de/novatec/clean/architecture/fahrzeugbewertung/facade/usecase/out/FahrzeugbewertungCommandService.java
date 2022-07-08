package de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbewertung;

public interface FahrzeugbewertungCommandService {
    Fahrzeugbewertung saveFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);

    Fahrzeugbewertung deleteFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung);
}
