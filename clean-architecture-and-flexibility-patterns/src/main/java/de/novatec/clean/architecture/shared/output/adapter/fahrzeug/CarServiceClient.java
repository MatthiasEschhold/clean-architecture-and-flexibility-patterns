package de.novatec.clean.architecture.shared.output.adapter.fahrzeug;

import de.novatec.clean.architecture.external.service.api.CarsApi;
import de.novatec.clean.architecture.external.service.api.SystemApi;
import de.novatec.clean.architecture.external.service.model.BasicAuth;
import de.novatec.clean.architecture.external.service.model.Car;
import de.novatec.clean.architecture.external.service.model.CarMasterdata;
import de.novatec.clean.architecture.fahrzeugangebot.domain.model.Fahrzeugstammdaten;
import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.FetchFahrzeugstammdaten;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrgestellnummer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out.ReadFahrzeug;

public class CarServiceClient implements ReadFahrzeug, FetchFahrzeugstammdaten {

    private final CarsApi carsApi;
    private final SystemApi systemApi;
    private final FahrzeugToCarMapper fahrzeugToCarMapper;
    private final FahrzeugstammdatenToCarMapper fahrzeugstammdatenToCarMapper;

    public CarServiceClient(CarsApi carsApi, SystemApi systemApi, FahrzeugToCarMapper fahrzeugToCarMapper, FahrzeugstammdatenToCarMapper fahrzeugstammdatenToCarMapper) {
        this.carsApi = carsApi;
        this.systemApi = systemApi;
        this.fahrzeugToCarMapper = fahrzeugToCarMapper;
        this.fahrzeugstammdatenToCarMapper = fahrzeugstammdatenToCarMapper;
    }

    @Override
    public Fahrzeug readFahrzeug(Fahrgestellnummer fahrgestellnummer) {
        String apiKey = systemApi.doLogin(new BasicAuth()).block();
        Car car = carsApi.getCar(apiKey, fahrgestellnummer.getValue()).block();
        systemApi.doLogout(apiKey);
        return fahrzeugToCarMapper.mapCarToFahrzeug(car);
    }

    @Override
    public Fahrzeugstammdaten fetchFahrzeugstammdaten(String fahrgestellnummer) {
        String apiKey = systemApi.doLogin(new BasicAuth()).block();
        CarMasterdata carMasterdata = carsApi.getCarMasterData(apiKey,  fahrgestellnummer).block();
        systemApi.doLogout(apiKey);
        return fahrzeugstammdatenToCarMapper.mapCarToFahrzeugstammdaten(carMasterdata);
    }
}
