package de.novatec.clean.architecture.ersatzteile.usecase.in;

import de.novatec.clean.architecture.ersatzteile.domain.model.ErsatzteilKategorie;
import de.novatec.clean.architecture.ersatzteile.domain.model.Teileliste;

public interface CreateTeileliste {
    Teileliste findErsatzteile(String fahrgestellnummer, ErsatzteilKategorie... ersatzteilKategorie);
}
