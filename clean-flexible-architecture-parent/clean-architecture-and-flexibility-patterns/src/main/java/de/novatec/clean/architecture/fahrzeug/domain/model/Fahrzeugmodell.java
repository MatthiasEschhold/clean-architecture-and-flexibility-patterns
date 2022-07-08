package de.novatec.clean.architecture.fahrzeug.domain.model;

public class Fahrzeugmodell {
    private String modellbezeichnung;
    private String modellnummer;

    public void setModellbezeichnung(String modellbezeichnung) {
        this.modellbezeichnung = modellbezeichnung;
    }

    public void setModellnummer(String modellnummer) {
        this.modellnummer = modellnummer;
    }

    public String getModellbezeichnung() {
        return modellbezeichnung;
    }

    public String getModellnummer() {
        return modellnummer;
    }
}
