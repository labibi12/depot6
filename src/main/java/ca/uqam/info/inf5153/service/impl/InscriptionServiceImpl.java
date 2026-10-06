package ca.uqam.info.inf5153.service.impl;

import ca.uqam.info.inf5153.domain.GroupeCours;
import ca.uqam.info.inf5153.domain.Inscription;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class InscriptionServiceImpl {
    private final List<Inscription> listeInscriptions = new ArrayList<>();

    public void addInscription(Inscription inscription) {
        listeInscriptions.add(inscription);
    }

    public Inscription getInscription(String codePermanent, GroupeCours groupeCours) {
        Optional<Inscription> optionalInscription = listeInscriptions
                .stream()
                .filter(i -> Objects.equals(i.etudiant.codePermanent, codePermanent) && Objects.equals(i.groupeCours, groupeCours))
                .findFirst();

        return optionalInscription.orElse(null);
    }

    public List<Inscription> getInscriptions() {
        List<Inscription> li = listeInscriptions
                .stream()
                .toList();

        if (li.isEmpty()) {
            return null;
        } else {
            return li;
        }
    }

    public Inscription updateInscription(String codePermanent, GroupeCours groupeCours, LocalDate dateInscription, LocalDate dateAbandon, Number note) {
        Inscription i = getInscription(codePermanent, groupeCours);
        if (i != null) {
            i.dateInscription = dateInscription;
            i.dateAbandon = dateAbandon;
            i.note = note;
            return i;
        }
        return null;
    }

    public boolean deleteInscription(String codePermanent, GroupeCours groupeCours) {
        return listeInscriptions.removeIf(i -> Objects.equals(i.etudiant.codePermanent, codePermanent) && Objects.equals(i.groupeCours, groupeCours));
    }
}
