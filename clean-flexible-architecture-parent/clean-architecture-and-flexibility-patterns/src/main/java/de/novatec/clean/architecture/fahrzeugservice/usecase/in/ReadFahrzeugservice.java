package de.novatec.clean.architecture.fahrzeugservice.usecase.in;

import de.novatec.clean.architecture.fahrzeugservice.domain.model.Fahrzeugservice;

public interface ReadFahrzeugservice {
    Fahrzeugservice read(String servicekennung);
}
