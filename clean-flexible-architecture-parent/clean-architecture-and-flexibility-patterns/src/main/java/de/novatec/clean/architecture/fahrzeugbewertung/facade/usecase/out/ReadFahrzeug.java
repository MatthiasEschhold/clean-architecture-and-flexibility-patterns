package de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrgestellnummer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;

public interface ReadFahrzeug {
    Fahrzeug readFahrzeug(Fahrgestellnummer fahrgestellnummer);
}
