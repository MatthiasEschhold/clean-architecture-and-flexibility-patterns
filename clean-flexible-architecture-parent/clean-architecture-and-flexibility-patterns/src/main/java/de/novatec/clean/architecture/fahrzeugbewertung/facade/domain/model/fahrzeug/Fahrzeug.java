package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug;

public class Fahrzeug {
    private final Fahrgestellnummer fahrgestellnummer;

    public Fahrzeug(Fahrgestellnummer fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public Fahrgestellnummer getFahrgestellnummer() {
        return fahrgestellnummer;
    }
}
