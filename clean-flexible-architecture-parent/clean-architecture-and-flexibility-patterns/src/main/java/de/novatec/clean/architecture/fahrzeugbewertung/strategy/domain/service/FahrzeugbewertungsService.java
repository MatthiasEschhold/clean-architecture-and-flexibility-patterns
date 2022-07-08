package de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.service;

import com.google.inject.Inject;
import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Nutzertyp;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.service.strategy.FahrzeugbewertungStrategy;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.service.strategy.FahrzeugbewertungStrategyFactory;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.in.CalculateFahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.out.CalcuateMarktpreis;
import de.novatec.clean.architecture.fahrzeugbewertung.strategy.usecase.out.ReadFahrzeugstammdaten;

public class FahrzeugbewertungsService implements CalculateFahrzeugbewertung {

    @Inject
    private FahrzeugbewertungStrategyFactory fahrzeugbewertungStrategyFactory;
    @Inject
    private CalcuateMarktpreis calcuateMarktpreis;
    @Inject
    private ReadFahrzeugstammdaten readFahrzeugstammdaten;

    @Override
    public Fahrzeugbewertung calculate(Nutzertyp nutzertyp, String fahrgestellnummer) {
        Fahrzeug fahrzeug = readFahrzeugstammdaten.readFahrzeugdaten(fahrgestellnummer);
        Double marktwert = calcuateMarktpreis.calcuate(fahrzeug);
        FahrzeugbewertungStrategy strategy = fahrzeugbewertungStrategyFactory.create(nutzertyp);
        return strategy.calculate(nutzertyp, fahrzeug, marktwert);
    }

}
