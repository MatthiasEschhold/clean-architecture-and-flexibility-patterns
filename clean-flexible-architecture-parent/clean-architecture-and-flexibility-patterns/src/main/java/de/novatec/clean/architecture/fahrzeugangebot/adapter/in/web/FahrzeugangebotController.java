package de.novatec.clean.architecture.fahrzeugangebot.adapter.in.web;

import de.novatec.clean.architecture.fahrzeugangebot.usecase.in.CreateFahrzeugangebot;

public class FahrzeugangebotController {

    private final CreateFahrzeugangebot createFahrzeugangebot;

    public FahrzeugangebotController(CreateFahrzeugangebot createFahrzeugangebot) {
        this.createFahrzeugangebot = createFahrzeugangebot;
    }

    // ...
}
