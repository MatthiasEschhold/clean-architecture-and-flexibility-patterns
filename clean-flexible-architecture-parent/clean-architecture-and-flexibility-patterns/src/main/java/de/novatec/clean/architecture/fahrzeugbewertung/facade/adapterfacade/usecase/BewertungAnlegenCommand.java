package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugbewertungAnlageDto;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.common.Command;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.common.Rollback;

public interface BewertungAnlegenCommand extends Command<Long, FahrzeugbewertungAnlageDto>, Rollback {

}
