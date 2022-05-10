package de.clean.architecture.fahrzeugbewertung.decorator.domain.service;

import com.google.inject.Inject;
import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugwert;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.FahrzeugwertBezeichnung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.service.decorator.FahrzeugwertDecoratorFactory;
import de.clean.architecture.fahrzeugbewertung.decorator.usecase.in.PerformFahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.decorator.usecase.out.CalcuateMarktpreis;
import de.clean.architecture.fahrzeugbewertung.decorator.usecase.out.ReadFahrzeugstammdaten;

/**
 * Basisfunktionalität:
 * - Erzeugung Fahrzeugbewertung
 * - Ermittlung des Marktwert
 * - Auslösen der Decorator-Kette
 */
public class FahrzeugbewertungsService implements PerformFahrzeugbewertung {

    @Inject
    private CalcuateMarktpreis calcuateMarktpreis;
    @Inject
    private ReadFahrzeugstammdaten readFahrzeugstammdaten;
    @Inject
    private FahrzeugwertDecoratorFactory fahrzeugwertDecoratorFactory;

    @Override
    public Fahrzeugbewertung perform(FahrzeugbewertungCommand fahrzeugbewertungCommand) {
        Fahrzeug fahrzeug = readFahrzeugstammdaten.readFahrzeugdaten(fahrzeugbewertungCommand.getFahrgestellnummer());
        Double marktwert = calcuateMarktpreis.calcuate(fahrzeug);
        Fahrzeugbewertung fahrzeugbewertung = new Fahrzeugbewertung(fahrzeug, new Fahrzeugwert(marktwert, FahrzeugwertBezeichnung.MARKTWERT), fahrzeugbewertungCommand.getNutzertyp());
        fahrzeugbewertungCommand.setFahrzeugbewertung(fahrzeugbewertung);
        PerformFahrzeugbewertung decorator = fahrzeugwertDecoratorFactory.createDecorator(fahrzeugbewertungCommand.getNutzertyp());
        return decorator.perform(fahrzeugbewertungCommand);
    }
}
