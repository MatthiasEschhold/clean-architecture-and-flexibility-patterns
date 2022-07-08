package de.novatec.clean.architecture.fahrzeugangebot.usecase.out;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugangebot;

public interface SaveFahrzeugangebot {
    Fahrzeugangebot save(Fahrzeugangebot fahrzeugangebot);
}
