package de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.out;


import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Berechnungsfaktoren;

public interface ReadBerechnungsfaktoren {
    Berechnungsfaktoren readBerechnungsfaktorenForMarktwertKorrektur();
}
