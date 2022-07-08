package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.external.service.rating.service;

import de.novatec.clean.architecture.external.service.api.CarRatingApi;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.BewertungAnlegenCommand;

public class CreateCarRatingServiceClient implements BewertungAnlegenCommand {

    private final CarRatingApi carRatingApi;

    public CreateCarRatingServiceClient(CarRatingApi carRatingApi) {
        this.carRatingApi = carRatingApi;
    }

    @Override
    public boolean rollback(String apiKey, String txId) {
        return false;
    }

    @Override
    public String run(String apiKey, String model) {
        return null;
    }
}