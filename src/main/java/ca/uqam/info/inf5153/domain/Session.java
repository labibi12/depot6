package ca.uqam.info.inf5153.domain;

import java.time.LocalDate;

public class Session {
    public Number codeSession;
    public LocalDate dateDebut;
    public LocalDate dateFin;

    public Session(Number codeSession, LocalDate dateDebut, LocalDate dateFin) {
        this.codeSession = codeSession;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Inscription{codeSession='" + codeSession + "', dateDebut='" + dateDebut.toString() + "', dateFin='" + dateFin.toString() + "'}";
    }
}
