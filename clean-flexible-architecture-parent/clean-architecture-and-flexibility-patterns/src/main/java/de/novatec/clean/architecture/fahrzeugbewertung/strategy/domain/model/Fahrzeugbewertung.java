package de.novatec.clean.architecture.fahrzeugbewertung.strategy.domain.model;

public abstract class Fahrzeugbewertung {
    private Nutzertyp nutzertyp;
    private Double markwert;

    protected Fahrzeugbewertung(Nutzertyp nutzertyp, Double markwert) {
        this.nutzertyp = nutzertyp;
        this.markwert = markwert;
    }

    public Nutzertyp getNutzertyp() {
        return nutzertyp;
    }

    public Double getMarkwert() {
        return markwert;
    }
}
