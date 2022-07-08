package de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model;

public class SchnellBewertung extends Fahrzeugbewertung {
    private Double geschaetzterAngebotspreis;

    public SchnellBewertung(Nutzertyp nutzertyp, Double markwert, Double korrigierterMarktwert) {
        super(nutzertyp, markwert);
        this.geschaetzterAngebotspreis = korrigierterMarktwert;
    }

    public Double getGeschaetzterAngebotspreis() {
        return geschaetzterAngebotspreis;
    }
}
