package de.novatec.clean.architecture.fahrzeugangebot.domain.service;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugangebot;
import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugstammdaten;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.in.CreateFahrzeugangebot;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.CalculateAngebotspreis;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.FetchFahrzeugstammdaten;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.SaveFahrzeugangebot;
import de.novatec.clean.architecture.supporting.service.email.Email;
import de.novatec.clean.architecture.supporting.service.email.SendEmail;

public class FahrzeugangebotService implements CreateFahrzeugangebot {
    private final SendEmail sendEmail;
    private final SaveFahrzeugangebot saveFahrzeugangebot;
    private final FetchFahrzeugstammdaten fetchFahrzeugstammdaten;
    private final CalculateAngebotspreis calculateAngebotspreis;

    public FahrzeugangebotService(SendEmail sendEmail, SaveFahrzeugangebot saveFahrzeugangebot, FetchFahrzeugstammdaten fetchFahrzeugstammdaten, CalculateAngebotspreis calculateAngebotspreis) {
        this.sendEmail = sendEmail;
        this.saveFahrzeugangebot = saveFahrzeugangebot;
        this.fetchFahrzeugstammdaten = fetchFahrzeugstammdaten;
        this.calculateAngebotspreis = calculateAngebotspreis;
    }

    @Override
    public Fahrzeugangebot create(String fahrgestellnummer) {
        Fahrzeugstammdaten fahrzeugstammdaten = fetchFahrzeugstammdaten.fetchFahrzeugstammdaten(fahrgestellnummer);
        Double angebotspreis = calculateAngebotspreis.calculate(fahrgestellnummer);
        Fahrzeugangebot fahrzeugangebot = new Fahrzeugangebot(fahrgestellnummer, fahrzeugstammdaten, angebotspreis);
        fahrzeugangebot = saveFahrzeugangebot.save(fahrzeugangebot);
        sendEmail.send(new Email("postkorb@angebot.de",
                String.format("Neues Angebot für %s mit Angebotsnummer %s ",
                        fahrzeugangebot.getFahrgestellnummer(), fahrzeugangebot.getAngebotsnummer())));
        return fahrzeugangebot;
    }
}
