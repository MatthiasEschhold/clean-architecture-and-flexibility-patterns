package de.clean.architecture.fahrzeug.usecase.in;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface ReadFahrzeug {
    Fahrzeug read(String fahrgestellnummer);
}
