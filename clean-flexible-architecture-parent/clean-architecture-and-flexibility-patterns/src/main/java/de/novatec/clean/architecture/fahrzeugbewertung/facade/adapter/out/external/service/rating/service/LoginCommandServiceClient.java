package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.external.service.rating.service;

import de.novatec.clean.architecture.external.service.api.SystemApi;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.Credentials;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.LoginCommand;

public class LoginCommandServiceClient implements LoginCommand {

    private SystemApi systemApi;

    public LoginCommandServiceClient(SystemApi systemApi) {
        this.systemApi = systemApi;
    }

    @Override
    public String run(Credentials credentials) {

        return null;
    }
}
