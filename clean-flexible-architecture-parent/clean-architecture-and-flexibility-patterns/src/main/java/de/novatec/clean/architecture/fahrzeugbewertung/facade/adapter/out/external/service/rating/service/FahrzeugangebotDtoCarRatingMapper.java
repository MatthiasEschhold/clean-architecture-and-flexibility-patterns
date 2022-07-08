package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.external.service.rating.service;

import de.novatec.clean.architecture.external.service.model.CarRating;
import de.novatec.clean.architecture.external.service.model.RatingValue;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugbewertungDto;

public class FahrzeugangebotDtoCarRatingMapper {

    FahrzeugbewertungDto mapCarRatingToFahrzeugbewertungDto(CarRating carRating) {
        return new FahrzeugbewertungDto(
                carRating.getRatingValues().get(0).getValue().doubleValue(),
                carRating.getRatingValues().get(1).getValue().doubleValue());
    }
}
