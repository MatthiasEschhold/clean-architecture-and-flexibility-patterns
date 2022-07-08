package de.novatec.clean.architecture.supporting.service.email;

public class Email {
    private final String empfaenger;
    private final String text;

    public Email(String empfaenger, String text) {
        this.empfaenger = empfaenger;
        this.text = text;
    }

    public String getEmpfaenger() {
        return empfaenger;
    }

    public String getText() {
        return text;
    }
}
