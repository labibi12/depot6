package ca.uqam.info.inf5153.service.impl;

import ca.uqam.info.inf5153.domain.Etudiant;

import java.util.*;

public class EtudiantServiceImpl {
    private final List<Etudiant> etudiants = new ArrayList<>();

    public void addEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public Etudiant getEtudiant(String codePermanent) {
        Optional<Etudiant> optionalEtudiant = etudiants
            .stream()
            .filter(e -> Objects.equals(e.codePermanent, codePermanent)).findFirst();

        return optionalEtudiant.orElse(null);
    }

    public List<Etudiant> getEtudiantsCodeProgramme(Number codeProgramme) {
        List<Etudiant> etudiantList = etudiants
                .stream()
                .filter(e -> Objects.equals(e.codeProgramme, codeProgramme)).toList();

        if (etudiantList.isEmpty()) {
            return null;
        } else {
            return etudiantList;
        }
    }

    public Etudiant updateEtudiant(String codePermanent, String nom, String prenom, Number codeProgramme) {
        Etudiant e = getEtudiant(codePermanent);
        if (e != null) {
            e.nom = nom;
            e.prenom = prenom;
            e.codeProgramme = codeProgramme;
            return e;
        }
        return null;
    }

    public boolean deleteEtudiant(String codePermanent) {
        return etudiants.removeIf(e -> Objects.equals(e.codePermanent, codePermanent));
    }

    public List<Etudiant> getEtudiantsCodeProgrammeSessionEnCours(Number codeProgramme) {
        return List.of();
    }
}
