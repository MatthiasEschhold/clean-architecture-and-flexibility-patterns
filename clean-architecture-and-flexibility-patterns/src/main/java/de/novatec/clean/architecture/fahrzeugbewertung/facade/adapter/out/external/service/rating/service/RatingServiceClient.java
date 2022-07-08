package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.external.service.rating.service;

import de.novatec.clean.architecture.external.service.api.CarRatingApi;
import de.novatec.clean.architecture.external.service.model.CarRating;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugbewertungDto;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.BewertungDurchfuehrenCommand;

import java.math.BigDecimal;

public class RatingServiceClient implements BewertungDurchfuehrenCommand {

    private final CarRatingApi carRatingApi;
    private final FahrzeugangebotDtoCarRatingMapper mapper;

    public RatingServiceClient(CarRatingApi carRatingApi, FahrzeugangebotDtoCarRatingMapper mapper) {
        this.carRatingApi = carRatingApi;
        this.mapper = mapper;
    }

    @Override
    public FahrzeugbewertungDto run(String apiKey, String ratingId) {
        CarRating carRating = new CarRating();
        carRating.setRatingId(BigDecimal.valueOf(ratingId));
       return mapper.mapCarRatingToFahrzeugbewertungDto(carRatingApi.createCarRating(apiKey, carRating).blockFirst());
    }
}