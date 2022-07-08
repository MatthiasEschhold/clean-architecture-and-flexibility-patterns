package de.novatec.clean.architecture.fahrzeugservice.adapter.out.ersatzteile;

import de.novatec.clean.architecture.fahrzeugservice.usecase.out.FetchErsatzteile;
import de.novatec.clean.architecture.ersatzteile.usecase.in.CreateTeileliste;

public class FetchErsatzteileClient implements FetchErsatzteile {

    private final CreateTeileliste findErsatzteile;

    public FetchErsatzteileClient(CreateTeileliste createTeileliste) {
        this.findErsatzteile = createTeileliste;
    }
}
