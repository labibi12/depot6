package ca.uqam.info.inf5153.domain;

public class Enseignant {
    public String codeEnseignant;
    public String nom;
    public String prenom;

    public Enseignant(String codeEnseignant, String nom, String prenom) {
        this.codeEnseignant = codeEnseignant;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Enseignant{codeEnseignant='" + codeEnseignant + "', nom='" + nom + "', prenom=" + prenom + "'}";
    }
}
