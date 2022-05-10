package de.clean.architecture.fahrzeug.adapter.out.tmp.db;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeug.usecase.out.FetchFahrzeug;

public class FahrzeugTmpRepository implements FetchFahrzeug {

    private CarDbToFahrzeugMapper mapper;

    @Override
    public Fahrzeug fetch(String fahrgestellnummer) {
        //Anbindung der Datenbank für die Stammdaten z.B. mit JPA, Spring Data JDBC, etc.
        return mapper.mapToEntity(new CarDbEntity());
    }

}
