package de.clean.architecture.fahrzeug.adapter.in.web;

import com.google.inject.Inject;
import de.clean.architecture.fahrzeug.usecase.in.ReadFahrzeug;

public class FahrzeugController {

    @Inject
    private ReadFahrzeug readFahrzeug;
    @Inject
    private FahrzeugResourceEntityMapper mapper;

    //REST Support Unterstützung z.B. mit Spring Web
    public FahrzeugResource get(String fahrgestellnummer) {
        return mapper.mapToDto(readFahrzeug.read(fahrgestellnummer));
    }
}
