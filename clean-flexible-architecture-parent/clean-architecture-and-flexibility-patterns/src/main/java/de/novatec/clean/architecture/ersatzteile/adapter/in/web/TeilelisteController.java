package de.novatec.clean.architecture.ersatzteile.adapter.in.web;

import de.novatec.clean.architecture.ersatzteile.usecase.in.CreateTeileliste;

public class TeilelisteController {

    private final CreateTeileliste findErsatzteile;

    public TeilelisteController(CreateTeileliste findErsatzteile) {
        this.findErsatzteile = findErsatzteile;
    }

    // API Funktionlität nach REST
}
