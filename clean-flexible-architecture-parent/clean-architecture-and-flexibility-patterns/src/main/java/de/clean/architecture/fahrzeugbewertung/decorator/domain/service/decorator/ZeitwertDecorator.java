package de.clean.architecture.fahrzeugbewertung.decorator.domain.service.decorator;

import de.clean.architecture.fahrzeug.domain.model.Fahrzeug;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Fahrzeugbewertung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.FahrzeugwertBezeichnung;
import de.clean.architecture.fahrzeugbewertung.decorator.domain.service.FahrzeugbewertungCommand;
import de.clean.architecture.fahrzeugbewertung.decorator.usecase.in.PerformFahrzeugbewertung;

public class ZeitwertDecorator implements PerformFahrzeugbewertung {

    PerformFahrzeugbewertung decorator;

    public ZeitwertDecorator() {
    }

    public ZeitwertDecorator(PerformFahrzeugbewertung decorator) {
        this.decorator = decorator;
    }

    @Override
    public Fahrzeugbewertung perform(FahrzeugbewertungCommand fahrzeugbewertungCommand) {
        fahrzeugbewertungCommand.getFahrzeugbewertung()
                .addFahrzeugwert(calculateZeitwert(fahrzeugbewertungCommand.getFahrzeugbewertung().getFahrzeug()), FahrzeugwertBezeichnung.ZEITWERT);
        if (decorator != null) {
            return decorator.perform(fahrzeugbewertungCommand);
        }
        return fahrzeugbewertungCommand.getFahrzeugbewertung();
    }

    private Double calculateZeitwert(Fahrzeug fahrzeug) {
        //Z.B. Aufruf eines externen Service oder Implementierung einer komplexen Berechnungslogik.
        return 50000.00;
    }
}
