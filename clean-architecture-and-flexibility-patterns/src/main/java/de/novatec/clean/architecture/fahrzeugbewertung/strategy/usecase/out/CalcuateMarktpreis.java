package de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface CalcuateMarktpreis {
    Double calcuate(Fahrzeug fahrzeug);
}
