package ca.uqam.info.inf5153.domain;

public class GroupeCours {
    public Cours cours;
    public Enseignant enseignant;
    public Session session;
    public Number maxInscriptions;
    public String local;

    public GroupeCours(Cours cours, Enseignant enseignant, Session session, Number maxInscriptions, String local) {
        this.cours = cours;
        this.enseignant = enseignant;
        this.session = session;
        this.maxInscriptions = maxInscriptions;
        this.local = local;
    }

    @Override
    public String toString() {
        return "Cours{cours='" + cours.sigle + "', enseignant='" + enseignant + "', session='" + session + "', maxInscriptions=" + maxInscriptions + "', local=" + local + "'}";
    }
}
