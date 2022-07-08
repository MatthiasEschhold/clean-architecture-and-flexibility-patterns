package de.novatec.clean.architecture.fahrzeugangebot.usecase.in;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugangebot;

public interface CreateFahrzeugangebot {
    Fahrzeugangebot create(String fahrgestellnummer);
}
