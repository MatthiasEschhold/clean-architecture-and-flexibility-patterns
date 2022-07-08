package de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface ReadFahrzeugstammdaten {
    Fahrzeug readFahrzeugdaten(String fahrgestellnummer);
}
