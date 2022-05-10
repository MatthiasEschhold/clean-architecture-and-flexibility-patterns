package de.clean.architecture.fahrzeug.adapter.out.service.client;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeug.usecase.out.FetchFahrzeug;

public class FahrzeugServiceClient implements FetchFahrzeug {

    private CarDtoToFahrzeugMapper mapper;

    @Override
    public Fahrzeug fetch(String fahrgestellnummer) {
        //Aufruf des Stammdatenservice z.B. durch Nutzung Spring RestTemplate, Apache HttpClient, etc.
        return mapper.mapToEntity(new CarDto());
    }
}
