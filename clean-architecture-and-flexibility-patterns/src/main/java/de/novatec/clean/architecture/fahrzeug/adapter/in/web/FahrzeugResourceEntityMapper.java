package de.novatec.clean.architecture.fahrzeug.adapter.in.web;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;

class FahrzeugResourceEntityMapper {

    public Fahrzeug mapToEntity(FahrzeugResource dto) {
        //Mapping Logik
        return new Fahrzeug();
    }

    public FahrzeugResource mapToDto(Fahrzeug entity) {
        //Mapping Logik
        return new FahrzeugResource();
    }
}
