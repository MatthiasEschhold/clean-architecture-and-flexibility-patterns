package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase;

public interface LogoutCommand {
    boolean run(String apiKey);
}
