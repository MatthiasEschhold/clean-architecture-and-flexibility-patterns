package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.common;

public interface SubCommand<R, I> {
    R run(String apiKey, String txId, I model);
}
