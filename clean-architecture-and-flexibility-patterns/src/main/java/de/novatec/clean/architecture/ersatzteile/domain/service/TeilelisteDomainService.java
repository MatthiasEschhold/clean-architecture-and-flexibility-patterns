package de.novatec.clean.architecture.ersatzteile.domain.service;

import de.novatec.clean.architecture.ersatzteile.domain.model.Teileliste;
import de.novatec.clean.architecture.ersatzteile.domain.model.ErsatzteilKategorie;
import de.novatec.clean.architecture.ersatzteile.usecase.out.ErsatzteileDbQuery;

public class TeilelisteDomainService {

    private final ErsatzteileDbQuery ersatzteileDbQuery;

    public TeilelisteDomainService(ErsatzteileDbQuery ersatzteileDbQuery) {
        this.ersatzteileDbQuery = ersatzteileDbQuery;
    }

    public Teileliste findErsatzteile(String fahrzeugkategorie, String fahrzeugmodell,
                                      int baujahr, ErsatzteilKategorie... ersatzteilKategorie) {
        return null;
    }

}
