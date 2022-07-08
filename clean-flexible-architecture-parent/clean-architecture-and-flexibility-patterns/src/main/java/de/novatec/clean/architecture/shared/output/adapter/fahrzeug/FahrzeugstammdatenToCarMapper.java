package de.novatec.clean.architecture.shared.output.adapter.fahrzeug;

import de.novatec.clean.architecture.external.service.model.CarMasterdata;
import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugstammdaten;

public class FahrzeugstammdatenToCarMapper {

    public Fahrzeugstammdaten mapCarToFahrzeugstammdaten(CarMasterdata car) {
        return new Fahrzeugstammdaten();
    }
}
