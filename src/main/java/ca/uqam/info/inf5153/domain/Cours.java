package ca.uqam.info.inf5153.domain;

public class Cours {
    public String sigle;
    public String titre;
    public String description;
    public Number nbCredits;

    public Cours(String sigle, String titre, String description, Number nbCredits) {
        this.sigle = sigle;
        this.titre = titre;
        this.description = description;
        this.nbCredits = nbCredits;
    }

    @Override
    public String toString() {
        return "Cours{sigle='" + sigle + "', titre='" + titre + "', description='" + description + "', nbCredits=" + nbCredits + "'}";
    }
}
