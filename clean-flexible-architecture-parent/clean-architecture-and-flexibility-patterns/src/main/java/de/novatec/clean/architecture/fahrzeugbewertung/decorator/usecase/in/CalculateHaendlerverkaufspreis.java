package de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.in;

import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugwert;

public interface CalculateHaendlerverkaufspreis {
    Fahrzeugwert calculate(String fahrgestellnummer);
}
