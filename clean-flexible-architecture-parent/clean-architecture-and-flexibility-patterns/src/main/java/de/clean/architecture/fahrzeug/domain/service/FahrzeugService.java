package de.clean.architecture.fahrzeug.domain.service;

import com.google.inject.Inject;
import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeug.usecase.in.ReadFahrzeug;
import de.clean.architecture.fahrzeug.usecase.out.FetchFahrzeug;

public class FahrzeugService implements ReadFahrzeug {

    @Inject
    private FetchFahrzeug fetchFahrzeug;

    @Override
    public Fahrzeug read(String fahrgestellnummer) {
        return fetchFahrzeug.fetch(fahrgestellnummer);
    }
}
