package de.novatec.clean.architecture.fahrzeugangebot.usecase.out;

import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugstammdaten;

public interface FetchFahrzeugstammdaten {
    Fahrzeugstammdaten fetchFahrzeugstammdaten(String fahrgestellnummer);
}
