package de.clean.architecture.fahrzeugbewertung.strategy.usecase.out;


import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.Berechnungsfaktoren;

public interface ReadBerechnungsfaktoren {
    Berechnungsfaktoren readBerechnungsfaktorenForMarktwertKorrektur();
}
