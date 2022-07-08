package de.novatec.clean.architecture.shared.output.adapter.fahrzeug;

import de.novatec.clean.architecture.external.service.model.Car;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrgestellnummer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;

public class FahrzeugToCarMapper {

    public Fahrzeug mapCarToFahrzeug(Car car) {
        return new Fahrzeug(new Fahrgestellnummer("WBA1234hjki902"));
    }
}
