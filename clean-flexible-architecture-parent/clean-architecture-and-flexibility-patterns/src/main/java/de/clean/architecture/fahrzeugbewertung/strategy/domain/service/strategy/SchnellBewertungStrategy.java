package de.clean.architecture.fahrzeugbewertung.strategy.domain.service.strategy;

import com.google.inject.Inject;
import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.Berechnungsfaktoren;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.Nutzertyp;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.SchnellBewertung;
import de.clean.architecture.fahrzeugbewertung.strategy.usecase.out.ReadBerechnungsfaktoren;

public class SchnellBewertungStrategy implements FahrzeugbewertungStrategy {

    @Inject
    private ReadBerechnungsfaktoren readBerechnungsfaktoren;

    @Override
    public Fahrzeugbewertung calculate(Nutzertyp nutzertyp, Fahrzeug fahrzeug, Double marktwert) {
        Double korrigierterMarketwert = calculateKorrigierterMarktwert(marktwert, fahrzeug);
        return new SchnellBewertung(nutzertyp, 12000.00, korrigierterMarketwert);
    }

    private Double calculateKorrigierterMarktwert(Double durchschnittlicherMarktwert, Fahrzeug fahrzeug) {
        Berechnungsfaktoren berechnungsfaktoren = readBerechnungsfaktoren.readBerechnungsfaktorenForMarktwertKorrektur();
        Double wert = durchschnittlicherMarktwert % berechnungsfaktoren.getKleinmangelReduktionsfaktor();
        if (berechnungsfaktoren.getGeringeNachfrageReduktionsfaktor() != null) {
            wert = wert % berechnungsfaktoren.getGeringeNachfrageReduktionsfaktor();
        }
        return wert;
    }
}
