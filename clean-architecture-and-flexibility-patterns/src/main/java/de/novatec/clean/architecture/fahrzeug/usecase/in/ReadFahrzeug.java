package de.novatec.clean.architecture.fahrzeug.usecase.in;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

public interface ReadFahrzeug {
    Fahrzeug read(String fahrgestellnummer);
}
