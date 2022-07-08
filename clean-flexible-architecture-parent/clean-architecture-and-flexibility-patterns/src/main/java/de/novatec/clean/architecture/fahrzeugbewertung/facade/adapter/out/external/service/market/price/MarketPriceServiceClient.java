package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapter.out.external.service.market.price;

import de.novatec.clean.architecture.external.service.api.CarRatingApi;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Marktwert;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out.CalcuateMarktpreis;

public class MarketPriceServiceClient implements CalcuateMarktpreis {

    private CarRatingApi carRatingApi;

    @Override
    public Marktwert calcuate(Fahrzeug fahrzeugdaten) {

        // call api client

        return null;
    }
}
