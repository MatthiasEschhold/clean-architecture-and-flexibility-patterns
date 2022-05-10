package de.clean.architecture.fahrzeugbewertung.decorator.domain.service.decorator;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.FahrzeugwertBezeichnung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.service.FahrzeugbewertungCommand;
import de.clean.architecture.fahrzeugbewertung.decorator.usecase.in.PerformFahrzeugbewertung;

public class WiederbeschaffungswertDecorator implements PerformFahrzeugbewertung {

    PerformFahrzeugbewertung decorator;

    public WiederbeschaffungswertDecorator() {
    }

    public WiederbeschaffungswertDecorator(PerformFahrzeugbewertung decorator) {
        this.decorator = decorator;
    }

    @Override
    public Fahrzeugbewertung perform(FahrzeugbewertungCommand fahrzeugbewertungCommand) {
        fahrzeugbewertungCommand.getFahrzeugbewertung()
                .addFahrzeugwert(calculateWiederbeschaffungswert(fahrzeugbewertungCommand.getFahrzeugbewertung().getFahrzeug()), FahrzeugwertBezeichnung.WIEDERBESCHAFFUNGSWERT);
        if (decorator != null) {
            return decorator.perform(fahrzeugbewertungCommand);
        }
        return fahrzeugbewertungCommand.getFahrzeugbewertung();
    }

    private Double calculateWiederbeschaffungswert(Fahrzeug fahrzeug) {
        //Z.B. Aufruf eines externen Service oder Implementierung einer komplexen Berechnungslogik.
        return 90000.00;
    }
}
