package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugbewertungDto;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.common.Command;

public interface BewertungDurchfuehrenCommand extends Command<FahrzeugbewertungDto, Long> {

}
