package ca.uqam.info.inf5153.service.impl;

import ca.uqam.info.inf5153.domain.Enseignant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EnseignantServiceImpl {
    private final List<Enseignant> Enseignants = new ArrayList<>();

    public void addEnseignant(Enseignant e) {
        Enseignants.add(e);
    }

    public Enseignant getEnseignant(String codeEnseignant) {
        Optional<Enseignant> optionalEnseignant = Enseignants
                .stream()
                .filter(e -> Objects.equals(e.codeEnseignant, codeEnseignant)).findFirst();

        return optionalEnseignant.orElse(null);
    }

    public List<Enseignant> getEnseignants() {
        List<Enseignant> enseignantList = Enseignants
                .stream()
                .toList();

        if (enseignantList.isEmpty()) {
            return null;
        } else {
            return enseignantList;
        }
    }

    public Enseignant updateEnseignant(String codeEnseignant, String nom, String prenom) {
        Enseignant e = getEnseignant(codeEnseignant);
        if (e != null) {
            e.nom = nom;
            e.prenom = prenom;
            return e;
        }
        return null;
    }

    public boolean deleteEnseignant(String codeEnseignant) {
        return Enseignants.removeIf(e -> Objects.equals(e.codeEnseignant, codeEnseignant));
    }
}
