package de.novatec.clean.architecture.fahrzeugservice.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeugservice {

    private final String kennung;
    private final String bezeichnung;
    private List<Long> ersatzteile;

    public Fahrzeugservice(String kennung, String bezeichnung) {
        this.kennung = kennung;
        this.bezeichnung = bezeichnung;
        this.ersatzteile = new ArrayList<>();
    }

    public String getKennung() {
        return kennung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public List<Long> getErsatzteile() {
        return ersatzteile;
    }

    public void addErsatzteil(Long ersatzteilenummer) {
        ersatzteile.add(ersatzteilenummer);
    }
}
