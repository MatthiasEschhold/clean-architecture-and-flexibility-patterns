package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.db.fahrzeugbewertung;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out.FahrzeugbewertungCommandService;

public class FahrzeugbewertungRepository implements FahrzeugbewertungCommandService {

    @Override
    public Fahrzeugbewertung saveFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung) {
        return null;
    }

    @Override
    public Fahrzeugbewertung deleteFahrzeugbewertung(Fahrzeugbewertung fahrzeugbewertung) {
        return null;
    }

}
