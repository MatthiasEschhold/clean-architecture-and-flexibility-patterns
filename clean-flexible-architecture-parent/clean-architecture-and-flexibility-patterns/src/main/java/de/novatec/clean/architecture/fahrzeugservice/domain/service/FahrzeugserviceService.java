package de.novatec.clean.architecture.fahrzeugservice.domain.service;

import de.novatec.clean.architecture.fahrzeugservice.domain.model.Fahrzeugservice;
import de.novatec.clean.architecture.fahrzeugservice.usecase.in.ReadFahrzeugservice;
import de.novatec.clean.architecture.fahrzeugservice.usecase.out.FetchErsatzteile;

public class FahrzeugserviceService implements ReadFahrzeugservice {

    private final FetchErsatzteile fetchErsatzteile;

    public FahrzeugserviceService(FetchErsatzteile fetchErsatzteile) {
        this.fetchErsatzteile = fetchErsatzteile;
    }

    @Override
    public Fahrzeugservice read(String servicekennung) {
        return null;
    }
}
