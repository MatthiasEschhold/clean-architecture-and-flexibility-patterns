package de.novatec.clean.architecture.ersatzteile.application;

import de.novatec.clean.architecture.ersatzteile.domain.model.ErsatzteilKategorie;
import de.novatec.clean.architecture.ersatzteile.domain.model.Teileliste;
import de.novatec.clean.architecture.ersatzteile.domain.service.TeilelisteDomainService;
import de.novatec.clean.architecture.ersatzteile.usecase.in.CreateTeileliste;
import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeug.usecase.in.ReadFahrzeug;

public class TeilelisteApplicationService implements CreateTeileliste {

    private final TeilelisteDomainService teilelisteDomainService;
    private final ReadFahrzeug readFahrzeug;

    public TeilelisteApplicationService(TeilelisteDomainService teilelisteDomainService, ReadFahrzeug readFahrzeug) {
        this.teilelisteDomainService = teilelisteDomainService;
        this.readFahrzeug = readFahrzeug;
    }

    @Override
    public Teileliste findErsatzteile(String fahrgestellnummer, ErsatzteilKategorie... ersatzteilKategorie) {
        Fahrzeug fahrzeug = readFahrzeug.read(fahrgestellnummer);
        return teilelisteDomainService.findErsatzteile(fahrzeug.getFahrzeugkategorie().getValue(), fahrzeug.getFahrzeugmodell().getModellnummer(), fahrzeug.getBaujahr(), ersatzteilKategorie);
    }
}
