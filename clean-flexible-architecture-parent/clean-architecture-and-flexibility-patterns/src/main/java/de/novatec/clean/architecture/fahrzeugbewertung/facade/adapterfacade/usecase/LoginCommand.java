package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.Credentials;

public interface LoginCommand {
    String run(Credentials credentials);
}
