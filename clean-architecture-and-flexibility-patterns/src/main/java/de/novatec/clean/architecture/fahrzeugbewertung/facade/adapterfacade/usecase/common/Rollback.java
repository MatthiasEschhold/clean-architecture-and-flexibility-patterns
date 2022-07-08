package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.common;

public interface Rollback {
    boolean rollback(String apiKey, Long txId);
}
