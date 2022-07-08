package de.novatec.clean.architecture.fahrzeug.usecase.out;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface FetchFahrzeug {
    Fahrzeug fetch(String fahrgestellnummer);
}
