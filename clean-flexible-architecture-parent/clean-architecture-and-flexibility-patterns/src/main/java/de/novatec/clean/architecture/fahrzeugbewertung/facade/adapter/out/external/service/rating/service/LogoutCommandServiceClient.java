package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.external.service.rating.service;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.LogoutCommand;

public class LogoutCommandServiceClient implements LogoutCommand {
    @Override
    public boolean run(String model) {

        return true;
    }
}
