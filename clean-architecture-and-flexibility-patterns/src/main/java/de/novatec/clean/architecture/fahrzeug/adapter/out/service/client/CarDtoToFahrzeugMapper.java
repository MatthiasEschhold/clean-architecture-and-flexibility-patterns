package de.novatec.clean.architecture.fahrzeug.adapter.out.service.client;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

class CarDtoToFahrzeugMapper {

    public Fahrzeug mapToEntity(CarDto dto) {
        //Mapping Logik
        return new Fahrzeug();
    }

    public CarDto mapToDto(Fahrzeug entity) {
        //Mapping Logik
        return new CarDto();
    }
}
