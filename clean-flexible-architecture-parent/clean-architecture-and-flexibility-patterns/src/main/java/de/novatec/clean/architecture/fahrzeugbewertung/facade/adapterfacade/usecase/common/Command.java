package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.common;

public interface Command<R, I> {
    R run(String apiKey, I model);
}
