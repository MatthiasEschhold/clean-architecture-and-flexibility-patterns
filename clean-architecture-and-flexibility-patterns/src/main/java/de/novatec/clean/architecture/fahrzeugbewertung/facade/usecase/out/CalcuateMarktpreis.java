package de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Marktwert;

public interface CalcuateMarktpreis {
    Marktwert calcuate(Fahrzeug fahrzeugdaten);
}
