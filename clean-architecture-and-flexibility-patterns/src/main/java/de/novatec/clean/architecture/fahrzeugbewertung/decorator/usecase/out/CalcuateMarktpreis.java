package de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface CalcuateMarktpreis {
    Double calcuate(Fahrzeug fahrzeug);
}
