package de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.service;

import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugwert;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.FahrzeugwertBezeichnung;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.in.CalculateHaendlerverkaufspreis;

public class HaendlerverkaufsspreisService implements CalculateHaendlerverkaufspreis {

    @Override
    public Fahrzeugwert calculate(String fahrgestellnummer) {
        return new Fahrzeugwert(250000.00, FahrzeugwertBezeichnung.HAENDLERVERKAUFSWERT);
    }

}
