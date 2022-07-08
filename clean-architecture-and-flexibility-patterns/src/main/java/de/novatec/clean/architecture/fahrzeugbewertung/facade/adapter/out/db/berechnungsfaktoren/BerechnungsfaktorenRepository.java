package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.db.berechnungsfaktoren;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.NachfrageReduktionsfaktor;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out.ReadBerechnungsfaktoren;

public class BerechnungsfaktorenRepository implements ReadBerechnungsfaktoren {
    @Override
    public NachfrageReduktionsfaktor readBerechnungsfaktorenForMarktwertKorrektur() {
        return null;
    }
}
