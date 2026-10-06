**Cours :** INF5153 - Génie logiciel : Conception  
**Session :** Automne 2026  
**Enseignant :** Moustapha BOULGOUDAN

<h1 style="text-align: center;">Projet 1 - Conception logicielle d'un système de gestion des inscriptions à l'université</h1>

# Les objectifs du projet

- Identifier les lacunes dans la conception d'une application de gestion des inscriptions à l'université, puis proposer une conception améliorée pour corriger ces lacunes
- Proposer et expliquez/justifiez vos choix de conception pour intégrer les nouvelles fonctionnalités
- Mettre en œuvre/implémenter cette nouvelle conception améliorée

# Environnement de développement

- **Java (JDK 25)** pour la programmation;
- **Git et GitLab** pour le contrôle de version;
- **Maven (3.9.16)** pour la construction logicielle (_build_);
- **JUnit (4.13.2)** pour l'écriture des tests unitaires;
- **PlantUML 1.2026.8** pour les diagrammes de classes et de séquence UML;
- **IntelliJ IDEA Ultimate 2026.2** pour le développement.


Aucune interface utilisateur n'est exigée. Vous allez simplement créer, initialiser et manipuler des objets 
qui vont vous servir pour vérifier vos tests unitaires.

# Description de l'application

Dans le cadre d'un programme d'université, connu par son code, chaque étudiant admis à ce programme peut s'inscrire à 
des cours de ce programme durant les sessions d'automne, d'hiver et d'été. Un étudiant peut s'inscrire à quatre cours 
maximum durant une session.

Les classes Java, avec les attributs et sans les méthodes, sont les suivantes :

- **Session** (Number *codeSession*, LocalDate *dateDebut*, LocalDate *dateFin*)
- **Etudiant** (String *codePermanent*, String *nom*, String *prenom*, Number *codeProgramme*, int *statut*)
- **Enseignant** (String *codeEnseignant*, String *nom*, String *prenom*)
- **Cours** (String *sigle*, String *titre*, String *description*, Number *nbCredits*)
- **Groupecours** (Cours *cours*, Enseignant *enseignant*, Session *session*, Number *maxInscriptions*, String *local*)
- **Inscription** (Etudiant *etudiant*, Groupecours *groupeCours*, LocalDate *dateInscription*, LocalDate *dateAbandon*, Number *note*)

## Les fonctionnalités à développer

1. Récupérer la liste des cours enseignés dans un programme donné dans la session en cours
2. Calculer le nombre d'étudiants inscrits à un groupe-cours durant la session en cours
3. Trouver le programme ayant le plus grand nombre d'inscriptions durant la session en cours
4. Calculer le montant total facturé, pour un cours donné et durant la session en cours, à tous les étudiants inscrits dans ce cours
5. Calculer le montant total facturé, pour un programme donné et durant l'année en cours (exp.: 2025-2026), à tous les étudiants inscrits dans ce programme

Pour les fonctionnalités 4 et 5, vous devez intégrer de nouveaux concepts de domaine pour intégrer la gestion de la facturation 
des étudiants.

À chaque session, il y a une nouvelle facturation pour les étudiants inscrits à cette session. Le prix total à payer est la somme 
des prix à payer par groupe-cours durant cette session.

Aussi, le prix à payer par inscription dépend du statut de l'étudiant en matière de résidence permanente et de citoyenneté. Chaque 
étudiant a un statut parmi les suivants : (Citoyen canadien ou résident permanent domicilié dans la province du Québec, Citoyen 
canadien ou résident permanent domicilié dans une autre province du Canada, International).

# Le travail à réaliser

Le travail à réaliser consiste à :

1. Faire un fork de ce dépôt et le nommer *INF5153-20263-projet1-NOM* où NOM est le nom de famille d'un membre du groupe;
2. Donner le diagramme de classe correspondant au code fourni;
3. Analyser et identifier les lacunes dans cette conception;
4. Proposer et expliquer/justifier une nouvelle conception améliorée de la conception initiale (sans les fonctionnalités);
   - Nouveau diagramme de classes
   - Liste des principes de conception mis en place et comment ils sont renforcés
5. Mettre en œuvre/implémenter cette nouvelle conception améliorée;
6. Proposer et expliquer/justifier une nouvelle conception améliorée qui intègre les nouvelles fonctionnalités demandées;
   - Nouveau diagramme de classes
   - Liste des principes de conception mis en place et comment ils sont renforcés
7. Mettre en œuvre/implémenter cette nouvelle conception améliorée qui intègre les nouvelles fonctionnalités demandées;
8. Donner un diagramme de séquence pour chacune des cinq fonctionnalités;
9. Écrire des tests unitaires pour chacune des méthodes correspondant aux fonctionnalités ci-dessus;
10. Utiliser Maven pour compiler et vérifier le fonctionnement de votre application;
    - Le code doit obligatoirement compiler
    - Tous les tests doivent passer
11. Documenter votre travail dans le fichier README-PROJET1-RAPPORT.md et fournissez une version PDF de ce rapport.

Les diagrammes UML (classe et séquence) doivent être créés avec le logiciel PlantUML et le code source de ces diagrammes doit être sauvegardés dans le répertoire `uml` du dépôt du code source.

# Livrables

- Un seul fichier au format ZIP, à déposer sur [Moodle](https://ena01.uqam.ca/course/view.php?id=80025) au plus tard le 14 octobre 2026 à 23h59, contenant le code source de l'application ainsi le rapport de synthèse aux formats Markdown et PDF.
- Liste des membres du groupe ainsi que le lien du dépôt GitLab à indiquer dans la première page du rapport

Un gabarit du format du rapport à rendre est fourni avec le code : `README-PROJET1-RAPPORT.md`.

# Grille d'évaluation

| Élément d'évaluation                                                                         | Pondération |
|----------------------------------------------------------------------------------------------|-------------|
| Introduction                                                                                 | 5%          |
| Diagramme de classe correspondant au code fourni                                             | 5%          |
| Lacunes dans la conception initiale                                                          | 10%         |
| Nouvelle conception améliorée de la conception initiale, sans les nouvelles fonctionnalités  | 10%         |
| Nouvelle conception améliorée incluant les choix de conception des nouvelles fonctionnalités | 25%         |
| Implémentation des fonctionnalités avec la nouvelle conception améliorée                     | 30%         |
| Diagrammes de séquence des fonctionnalités de la nouvelle conception améliorée               | 10%         |
| Conclusion                                                                                   | 5%          |