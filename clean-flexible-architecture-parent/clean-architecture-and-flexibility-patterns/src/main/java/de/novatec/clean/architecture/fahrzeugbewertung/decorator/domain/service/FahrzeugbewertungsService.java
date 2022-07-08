package de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.service;

import com.google.inject.Inject;
import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugwert;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.FahrzeugwertBezeichnung;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.service.decorator.FahrzeugwertDecoratorFactory;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.in.PerformFahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.out.CalcuateMarktpreis;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.out.ReadFahrzeugstammdaten;
import de.novatec.clean.architecture.supporting.service.email.Email;
import de.novatec.clean.architecture.supporting.service.email.SendEmail;

/**
 * Basisfunktionalität:
 * - Erzeugung Fahrzeugbewertung
 * - Ermittlung des Marktwert
 * - Auslösen der Decorator-Kette
 */
public class FahrzeugbewertungsService implements PerformFahrzeugbewertung {

    private final CalcuateMarktpreis calcuateMarktpreis;
    private final ReadFahrzeugstammdaten readFahrzeugstammdaten;
    private final FahrzeugwertDecoratorFactory fahrzeugwertDecoratorFactory;
    private final SendEmail sendEmail;

    @Inject
    public FahrzeugbewertungsService(CalcuateMarktpreis calcuateMarktpreis, ReadFahrzeugstammdaten readFahrzeugstammdaten, FahrzeugwertDecoratorFactory fahrzeugwertDecoratorFactory, SendEmail sendEmail) {
        this.calcuateMarktpreis = calcuateMarktpreis;
        this.readFahrzeugstammdaten = readFahrzeugstammdaten;
        this.fahrzeugwertDecoratorFactory = fahrzeugwertDecoratorFactory;
        this.sendEmail = sendEmail;
    }

    @Override
    public Fahrzeugbewertung perform(FahrzeugbewertungCommand fahrzeugbewertungCommand) {
        Fahrzeug fahrzeug = readFahrzeugstammdaten.readFahrzeugdaten(fahrzeugbewertungCommand.getFahrgestellnummer());
        Double marktwert = calcuateMarktpreis.calcuate(fahrzeug);
        Fahrzeugbewertung fahrzeugbewertung = new Fahrzeugbewertung(fahrzeug, new Fahrzeugwert(marktwert, FahrzeugwertBezeichnung.MARKTWERT), fahrzeugbewertungCommand.getNutzertyp());
        fahrzeugbewertungCommand.setFahrzeugbewertung(fahrzeugbewertung);
        PerformFahrzeugbewertung decorator = fahrzeugwertDecoratorFactory.createDecorator(fahrzeugbewertungCommand.getNutzertyp());
        fahrzeugbewertung = decorator.perform(fahrzeugbewertungCommand);
        sendEmail.send(new Email("postkorb@bewertung.de", String.format("Neue Bewertung für %s mit Bewertungsnummer %s ",
                fahrzeugbewertung.getFahrzeug().getFahrgestellnummer(), fahrzeugbewertung.getBewertungsnummer())));
        return fahrzeugbewertung;
    }
}
