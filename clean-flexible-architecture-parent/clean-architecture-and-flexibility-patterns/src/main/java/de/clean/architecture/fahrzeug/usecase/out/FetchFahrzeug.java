package de.clean.architecture.fahrzeug.usecase.out;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface FetchFahrzeug {
    Fahrzeug fetch(String fahrgestellnummer);
}
