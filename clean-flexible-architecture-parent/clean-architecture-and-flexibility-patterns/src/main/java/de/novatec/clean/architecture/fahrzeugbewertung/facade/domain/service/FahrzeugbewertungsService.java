package de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.service;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.FahrzeugbewertungsAdapterFacade;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbesitzer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrgestellnummer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Marktwert;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.in.CalculateFahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out.CalcuateMarktpreis;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out.ReadFahrzeug;

public class FahrzeugbewertungsService implements CalculateFahrzeugbewertung {

    private CalcuateMarktpreis calcuateMarktpreis;
    private ReadFahrzeug readFahrzeug;
    private FahrzeugbewertungsAdapterFacade fahrzeugbewertungsAdapterFacade;

    public Fahrzeugbewertung calculate(Fahrzeugbesitzer besitzer, Fahrgestellnummer fahrgestellnummer) {
        Fahrzeug fahrzeug = readFahrzeug.readFahrzeug(fahrgestellnummer);
        Marktwert marktwert = calcuateMarktpreis.calcuate(fahrzeug);
        return fahrzeugbewertungsAdapterFacade.create(besitzer, fahrzeug, marktwert);
    }

}
