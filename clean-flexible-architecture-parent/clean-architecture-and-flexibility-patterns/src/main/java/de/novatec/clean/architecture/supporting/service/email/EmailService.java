package de.novatec.clean.architecture.supporting.service.email;

public class EmailService implements SendEmail {
    @Override
    public boolean send(Email email) {
        return false;
    }
}
