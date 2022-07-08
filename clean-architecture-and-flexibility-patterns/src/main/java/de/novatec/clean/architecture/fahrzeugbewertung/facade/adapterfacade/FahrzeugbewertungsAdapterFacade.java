package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade;

import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.mapper.FahrzeugToFahrzeugDtoMapper;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.mapper.FahrzeugbewertungToFahrzeugbewertungDtoMapper;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.Credentials;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugbewertungAnlageDto;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model.FahrzeugbewertungDto;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.usecase.*;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbesitzer;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.bewertung.Fahrzeugbewertung;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeug.Fahrzeug;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.domain.model.fahrzeugwert.Marktwert;
import de.novatec.clean.architecture.fahrzeugbewertung.facade.usecase.out.CreateFahrzeugbewertung;

public class FahrzeugbewertungsAdapterFacade implements CreateFahrzeugbewertung {

    private static final String FAHRZEUGBEWERTUNG_KANN_NICHT_DURCHGEFUEHRT_WERDEN = "Fahrzeugbewertung kann nicht durchgefuehrt werden!";

    private final BewertungAnlegenCommand fahrzeugbewertungAnlegenCommand;
    private final FahrzeugHinzufuegenCommand fahrzeugHinzufuegenCommand;
    private final BewertungDurchfuehrenCommand bewertungDurchfuehrenCommand;

    private final LoginCommand loginCommand;
    private final LogoutCommand logoutCommand;
    private final ReadCredentialsCommand readCredentialsCommand;
    private final FahrzeugToFahrzeugDtoMapper fahrzeugToFahrzeugDtoMapper;
    private final FahrzeugbewertungToFahrzeugbewertungDtoMapper fahrzeugbewertungToFahrzeugbewertungDtoMapper;

    public FahrzeugbewertungsAdapterFacade(BewertungAnlegenCommand fahrzeugbewertungAnlegenCommand,
                                           FahrzeugHinzufuegenCommand fahrzeugHinzufuegenCommand,
                                           BewertungDurchfuehrenCommand bewertungDurchfuehrenCommand,
                                           LoginCommand loginCommand, LogoutCommand logoutCommand,
                                           ReadCredentialsCommand readCredentialsCommand,
                                           FahrzeugToFahrzeugDtoMapper fahrzeugToFahrzeugDtoMapper,
                                           FahrzeugbewertungToFahrzeugbewertungDtoMapper fahrzeugbewertungToFahrzeugbewertungDtoMapper) {
        this.fahrzeugbewertungAnlegenCommand = fahrzeugbewertungAnlegenCommand;
        this.fahrzeugHinzufuegenCommand = fahrzeugHinzufuegenCommand;
        this.bewertungDurchfuehrenCommand = bewertungDurchfuehrenCommand;
        this.loginCommand = loginCommand;
        this.logoutCommand = logoutCommand;
        this.readCredentialsCommand = readCredentialsCommand;
        this.fahrzeugToFahrzeugDtoMapper = fahrzeugToFahrzeugDtoMapper;
        this.fahrzeugbewertungToFahrzeugbewertungDtoMapper = fahrzeugbewertungToFahrzeugbewertungDtoMapper;
    }

    public Fahrzeugbewertung create(Fahrzeugbesitzer besitzer, Fahrzeug fahrzeug, Marktwert marktwert) {
        String apiKey = loginCommand.run(readCredentialsCommand.run());
        try {
            Long bewertungsnummer = fahrzeugbewertungAnlegen(apiKey, fahrzeug, besitzer);
            fahrzeugHinzufuegen(apiKey, bewertungsnummer, fahrzeug);
            FahrzeugbewertungDto bewertungDto = bewertungDurchfuehren(apiKey, bewertungsnummer);
            return fahrzeugbewertungToFahrzeugbewertungDtoMapper.mapFahrzeugbewertungDtoToFahrzeugbewertung(bewertungDto);
        } catch (Exception e) {
            throw e;
        } finally {
            logoutCommand.run(apiKey);
        }
    }

    private FahrzeugbewertungDto bewertungDurchfuehren(String apiKey, Long bewertungsnummer) {
        try {
            return bewertungDurchfuehrenCommand.run(apiKey, bewertungsnummer);
        } catch (Exception e) {
            fahrzeugbewertungAnlegenCommand.rollback(apiKey, bewertungsnummer);
            throw new RuntimeException(FAHRZEUGBEWERTUNG_KANN_NICHT_DURCHGEFUEHRT_WERDEN, e);
        }
    }

    private void fahrzeugHinzufuegen(String apiKey, Long bewertungsnummer, Fahrzeug fahrzeug) {
        try {
            fahrzeugHinzufuegenCommand.run(apiKey, bewertungsnummer, fahrzeugToFahrzeugDtoMapper.mapFahrzeugToCarToRateDto(fahrzeug));
        } catch (Exception e) {
            fahrzeugbewertungAnlegenCommand.rollback(apiKey, bewertungsnummer);
            throw new RuntimeException(FAHRZEUGBEWERTUNG_KANN_NICHT_DURCHGEFUEHRT_WERDEN, e);
        }
    }

    private Long fahrzeugbewertungAnlegen(String apiKey, Fahrzeug fahrzeug, Fahrzeugbesitzer fahrzeugbesitzer) {
        try {
            return fahrzeugbewertungAnlegenCommand.run(apiKey,
                    new FahrzeugbewertungAnlageDto(fahrzeugbesitzer.getName(),
                            fahrzeugbesitzer.getVorname(),
                            fahrzeug.getFahrgestellnummer().getValue()));
        } catch (Exception e) {
            throw new RuntimeException(FAHRZEUGBEWERTUNG_KANN_NICHT_DURCHGEFUEHRT_WERDEN, e);
        }
    }

    private String login() {
        try {
            Credentials credentials = readCredentialsCommand.run();
            return loginCommand.run(credentials);
        } catch (Exception e) {
            throw new RuntimeException("Loging zur Fahrzeugbewertung nicht möglich");
        }
    }

}
