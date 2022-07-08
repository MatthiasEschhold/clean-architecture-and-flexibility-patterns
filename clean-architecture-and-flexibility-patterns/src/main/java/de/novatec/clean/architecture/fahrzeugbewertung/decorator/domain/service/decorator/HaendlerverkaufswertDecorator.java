package de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.service.decorator;

import de.novatec.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.model.FahrzeugwertBezeichnung;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.domain.service.FahrzeugbewertungCommand;
import de.novatec.clean.architecture.fahrzeugbewertung.decorator.usecase.in.PerformFahrzeugbewertung;

public class HaendlerverkaufswertDecorator implements PerformFahrzeugbewertung {

    PerformFahrzeugbewertung decorator;

    public HaendlerverkaufswertDecorator() {
    }

    public HaendlerverkaufswertDecorator(PerformFahrzeugbewertung decorator) {
        this.decorator = decorator;
    }

    @Override
    public Fahrzeugbewertung perform(FahrzeugbewertungCommand fahrzeugbewertungCommand) {
        fahrzeugbewertungCommand.getFahrzeugbewertung()
                .addFahrzeugwert(calculateHaendlerverkaufswert(fahrzeugbewertungCommand.getFahrzeugbewertung().getFahrzeug()), FahrzeugwertBezeichnung.HAENDLERVERKAUFSWERT);
        if (decorator != null) {
            return decorator.perform(fahrzeugbewertungCommand);
        }
        return fahrzeugbewertungCommand.getFahrzeugbewertung();
    }

    private Double calculateHaendlerverkaufswert(Fahrzeug fahrzeug) {
        //Z.B. Aufruf eines externen Service oder Implementierung einer komplexen Berechnungslogik.
        return 11000.00;
    }
}
