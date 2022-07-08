package de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.service.strategy;


import de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model.Nutzertyp;

public class FahrzeugbewertungStrategyFactory {

    public FahrzeugbewertungStrategy create(Nutzertyp nutzertyp) {
        if (nutzertyp == Nutzertyp.INTERESSENT_IN) {
            return new SchnellBewertungStrategy();
        } else {
            return new ExakteBewertungStrategy();
        }
    }
}
