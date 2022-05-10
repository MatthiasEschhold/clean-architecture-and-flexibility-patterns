package de.clean.architecture.fahrzeugbewertung.strategy.domain.service.strategy;

import com.google.inject.Inject;
import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.ExakteBewertung;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.strategy.domain.model.SpezielleFahrzeugwerte;
import de.clean.architecture.fahrzeugbewertung.strategy.usecase.out.CalculateFahhrzeugwerte;
import de.clean.architecture.fahrzeugbewertung.strategy.usecase.out.FahrzeugbewertungCommandService;
import de.clean.architecture.fahrzeugbewertung.strategy.usecase.out.ReadBerechnungsfaktoren;

public class ExakteBewertungStrategy implements FahrzeugbewertungStrategy {

    @Inject
    private CalculateFahhrzeugwerte calculateFahhrzeugwerte;
    @Inject
    private ReadBerechnungsfaktoren readBerechnungsfaktoren;
    @Inject
    private FahrzeugbewertungCommandService saveFahrzeugbewertung;

    @Override
    public Fahrzeugbewertung calculate(Nutzertyp nutzertyp, Fahrzeug fahrzeug, Double marktpreis) {
        SpezielleFahrzeugwerte spezielleFahrzeugwerte = calculateFahhrzeugwerte.calculate(nutzertyp, fahrzeug);
        return saveFahrzeugbewertung.saveFahrzeugbewertung(new ExakteBewertung(nutzertyp, marktpreis, spezielleFahrzeugwerte));
    }

}
