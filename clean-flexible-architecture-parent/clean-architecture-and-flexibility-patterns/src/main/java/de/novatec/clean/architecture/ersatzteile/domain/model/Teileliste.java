package de.novatec.clean.architecture.ersatzteile.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teileliste {
    private Date anlagedatum;
    private String fahrgestellnummer;
    private List<Ersatzteil> ersatzteile;

    public Teileliste(Date anlagedatum, String fahrgestellnummer) {
        this.anlagedatum = anlagedatum;
        this.fahrgestellnummer = fahrgestellnummer;
        this.ersatzteile = new ArrayList<>();
    }

    public Date getAnlagedatum() {
        return anlagedatum;
    }

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public List<Ersatzteil> getErsatzteile() {
        return ersatzteile;
    }

    public void addErsatzteil(Ersatzteil  ersatzteil) {
        this.ersatzteile.add(ersatzteil);
    }
}
