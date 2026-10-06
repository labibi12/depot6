package ca.uqam.info.inf5153.domain;

import java.time.LocalDate;

public class Inscription {
    public Etudiant etudiant;
    public GroupeCours groupeCours;
    public LocalDate dateInscription;
    public LocalDate dateAbandon;
    public Number note;

    public Inscription(Etudiant etudiant, GroupeCours groupeCours, LocalDate dateInscription, LocalDate dateAbandon, Number note) {
        this.etudiant = etudiant;
        this.groupeCours = groupeCours;
        this.dateInscription = dateInscription;
        this.dateAbandon = dateAbandon;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Inscription{etudiant='" + etudiant + "', groupeCours='" + groupeCours + "', dateInscription='" + dateInscription.toString() + "', dateAbandon='" + dateAbandon.toString() + "', note='" + note + "'}";
    }
}
