package de.clean.architecture.fahrzeug.adapter.out.tmp.db;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;

class CarDbToFahrzeugMapper {

    public Fahrzeug mapToEntity(CarDbEntity dto) {
        return new Fahrzeug();
    }

    public CarDbEntity mapToDto(Fahrzeug entity) {
        return new CarDbEntity();
    }
}
