package de.clean.architecture.fahrzeugbewertung.strategy.domain.model;


public class ExakteBewertung extends Fahrzeugbewertung {
    private SpezielleFahrzeugwerte spezielleFahrzeugwerte;

    public ExakteBewertung(Nutzertyp nutzertyp, Double marktwert, SpezielleFahrzeugwerte spezielleFahrzeugwerte) {
        super(nutzertyp, marktwert);
        this.spezielleFahrzeugwerte = spezielleFahrzeugwerte;
    }

    public SpezielleFahrzeugwerte getSpezielleFahrzeugwerte() {
        return spezielleFahrzeugwerte;
    }
}
