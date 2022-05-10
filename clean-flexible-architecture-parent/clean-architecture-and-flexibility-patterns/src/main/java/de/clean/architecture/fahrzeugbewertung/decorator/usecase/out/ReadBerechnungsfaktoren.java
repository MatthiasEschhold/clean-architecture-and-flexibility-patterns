package de.clean.architecture.fahrzeugbewertung.decorator.usecase.out;


import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Berechnungsfaktoren;

public interface ReadBerechnungsfaktoren {
    Berechnungsfaktoren readBerechnungsfaktorenForMarktwertKorrektur();
}
