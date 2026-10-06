package ca.uqam.info.inf5153.service.impl;

import ca.uqam.info.inf5153.domain.Cours;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CoursServiceImpl {
    public final List<Cours> listeCours = new ArrayList<>();

    public void addCours(Cours c) {
        listeCours.add(c);
    }

    public Cours getCours(String sigle) {
        Optional<Cours> optionalCours = listeCours
                .stream()
                .filter(c -> Objects.equals(c.sigle, sigle)).findFirst();

        return optionalCours.orElse(null);
    }

    public List<Cours> getTousCours() {
        List<Cours> lc = listeCours
                .stream()
                .toList();

        if (lc.isEmpty()) {
            return null;
        } else {
            return lc;
        }
    }

    public Cours updateCours(String sigle, String titre, String description, Number nbCredits) {
        Cours c = getCours(sigle);
        if (c != null) {
            c.titre = titre;
            c.description = description;
            c.nbCredits = nbCredits;
            return c;
        }
        return null;
    }

    public boolean deleteCours(String sigle) {
        return listeCours.removeIf(c -> Objects.equals(c.sigle, sigle));
    }
}
