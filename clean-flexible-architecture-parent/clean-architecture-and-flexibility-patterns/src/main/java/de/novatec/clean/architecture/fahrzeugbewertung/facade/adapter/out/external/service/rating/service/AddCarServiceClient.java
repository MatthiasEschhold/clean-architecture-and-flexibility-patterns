package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.external.service.rating.service;

import de.novatec.clean.architecture.external.service.api.CarRatingApi;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugDto;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.FahrzeugHinzufuegenCommand;

public class AddCarServiceClient implements FahrzeugHinzufuegenCommand {

    private final CarRatingApi carRatingApi;

    public AddCarServiceClient(CarRatingApi carRatingApi) {
        this.carRatingApi = carRatingApi;
    }

    @Override
    public Void run(String apiKey, String ratingId, FahrzeugDto fahrzeugDto) {
        return null;
    }
}
