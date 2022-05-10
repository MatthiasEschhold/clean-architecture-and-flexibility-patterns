package de.clean.architecture.fahrzeugbewertung.strategy.domain.model;

public class Berechnungsfaktoren {
    private Integer kleinmangelReduktionsfaktor;
    private Integer geringeNachfrageReduktionsfaktor;

    public Berechnungsfaktoren(Integer kleinmangelReduktionsfaktor, Integer geringeNachfrageReduktionsfaktor) {
        this.kleinmangelReduktionsfaktor = kleinmangelReduktionsfaktor;
        this.geringeNachfrageReduktionsfaktor = geringeNachfrageReduktionsfaktor;
    }

    public Integer getKleinmangelReduktionsfaktor() {
        return kleinmangelReduktionsfaktor;
    }

    public Integer getGeringeNachfrageReduktionsfaktor() {
        return geringeNachfrageReduktionsfaktor;
    }
}
