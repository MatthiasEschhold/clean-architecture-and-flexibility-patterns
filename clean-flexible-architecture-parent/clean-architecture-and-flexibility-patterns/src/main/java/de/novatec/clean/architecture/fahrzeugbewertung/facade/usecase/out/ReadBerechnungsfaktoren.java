package de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.NachfrageReduktionsfaktor;

public interface ReadBerechnungsfaktoren {
    NachfrageReduktionsfaktor readBerechnungsfaktorenForMarktwertKorrektur();
}
