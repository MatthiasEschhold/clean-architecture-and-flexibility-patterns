package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugDto;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.common.SubCommand;

public interface FahrzeugHinzufuegenCommand extends SubCommand<Void, FahrzeugDto> {
    Void run(String apiKey, Long ratingId, FahrzeugDto fahrzeugDto);
}
