package de.clean.architecture.fahrzeugbewertung.strategy.usecase.out;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface ReadFahrzeugstammdaten {
    Fahrzeug readFahrzeugdaten(String fahrgestellnummer);
}
