package ca.uqam.info.inf5153.domain;

public class Etudiant {
    public String codePermanent;
    public String nom;
    public String prenom;
    public Number codeProgramme;
    public int statut;

    public Etudiant(String codePermanent, String nom, String prenom, Number codeProgramme, int statut) {
        this.codePermanent = codePermanent;
        this.nom = nom;
        this.prenom = prenom;
        this.codeProgramme = codeProgramme;
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Etudiant{statut='" + statut + "', codePermanent='" + codePermanent + "', nom='" + nom + "', prenom=" + prenom + ", codeProgramme=" + codeProgramme + "'}";
    }
}
