package de.novatec.clean.architecture.fahrzeugangebot.adapter.out.fahrzeugpreis;

import de.novatec.clean.architecture.fahrzeugangebot.usecase.out.CalculateAngebotspreis;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.in.CalculateHaendlerverkaufspreis;

public class AngebotspreisAdapter implements CalculateAngebotspreis {

    private final CalculateHaendlerverkaufspreis calculateHaendlerverkaufspreis;

    public AngebotspreisAdapter(CalculateHaendlerverkaufspreis calculateHaendlerverkaufspreis) {
        this.calculateHaendlerverkaufspreis = calculateHaendlerverkaufspreis;
    }

    @Override
    public Double calculate(String fahrgestellnummer) {
        return null;
    }
}
