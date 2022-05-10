package de.clean.architecture.fahrzeugbewertung.decorator.domain.service.decorator;

import de.clean.architecture.fahrzeugbewertung.decorator.domain.model.Nutzertyp;
import de.clean.architecture.fahrzeugbewertung.decorator.usecase.in.PerformFahrzeugbewertung;

public class FahrzeugwertDecoratorFactory {

    public PerformFahrzeugbewertung createDecorator(Nutzertyp nutzertyp) {
        if (nutzertyp == Nutzertyp.INTERESSENT_IN) {
            return new GeschaetzterAngebotspreisDecorator();
        } else if (nutzertyp == Nutzertyp.AUTOMOBILVERKAEUFER_IN) {
            return new HaendlerverkaufswertDecorator(new WiederbeschaffungswertDecorator());
        } else {
            //Gutachter:in
            return new HaendlerverkaufswertDecorator(new WiederbeschaffungswertDecorator(new ZeitwertDecorator()));
        }
    }
}
