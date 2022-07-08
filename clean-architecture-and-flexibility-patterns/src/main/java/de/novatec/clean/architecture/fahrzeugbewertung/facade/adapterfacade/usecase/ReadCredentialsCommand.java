package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.Credentials;

public interface ReadCredentialsCommand {
    Credentials run();
}
