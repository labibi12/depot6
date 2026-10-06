package ca.uqam.info.inf5153.service.impl;

import ca.uqam.info.inf5153.domain.Cours;
import ca.uqam.info.inf5153.domain.Enseignant;
import ca.uqam.info.inf5153.domain.GroupeCours;
import ca.uqam.info.inf5153.domain.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GroupeCoursServiceImpl {
    private final List<GroupeCours> listeGroupeCours = new ArrayList<>();

    public void addGroupeCours(GroupeCours groupeCours) {
        listeGroupeCours.add(groupeCours);
    }

    public GroupeCours getGroupeCours(String sigle, Number codeSession, String local) {
        Optional<GroupeCours> optionalGroupeCours = listeGroupeCours
                .stream()
                .filter(gc -> Objects.equals(gc.cours.sigle, sigle) && Objects.equals(gc.session.codeSession, codeSession) && Objects.equals(gc.local, local))
                .findFirst();

        return optionalGroupeCours.orElse(null);
    }

    public List<GroupeCours> getTousGroupeCours() {
        List<GroupeCours> lgc = listeGroupeCours
                .stream()
                .toList();

        if (lgc.isEmpty()) {
            return null;
        } else {
            return lgc;
        }
    }

    public GroupeCours updateGroupeCours(Cours cours, Enseignant enseignant, Session session, Number maxInscriptions, String local) {
        GroupeCours gc = getGroupeCours(cours.sigle, session.codeSession, local);
        if (gc != null) {
            gc.cours = cours;
            gc.enseignant = enseignant;
            gc.session = session;
            gc.maxInscriptions = maxInscriptions;
            gc.local = local;
            return gc;
        }
        return null;
    }

    public boolean deleteGroupeCours(String sigle, Number codeSession, String local) {
        return listeGroupeCours.removeIf(gc -> Objects.equals(gc.cours.sigle, sigle) && Objects.equals(gc.session.codeSession, codeSession) && Objects.equals(gc.local, local));
    }
}
