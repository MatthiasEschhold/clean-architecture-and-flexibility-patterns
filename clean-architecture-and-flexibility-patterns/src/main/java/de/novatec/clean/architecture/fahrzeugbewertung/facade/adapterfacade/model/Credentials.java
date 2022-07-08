package de.novatec.clean.architecture.fahrzeugbewertung.facade.adapterfacade.model;

public class Credentials {
    private String username;
    private String secret;

    public Credentials(String username, String secret) {
        this.username = username;
        this.secret = secret;
    }

    public String getUsername() {
        return username;
    }

    public String getSecret() {
        return secret;
    }
}
