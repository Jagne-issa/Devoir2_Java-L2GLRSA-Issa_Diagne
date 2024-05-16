package entities;

public class Professeur {

    private int id;
    private String nom;
    private String prenom;
    private String matiereEnseignee;

    public Professeur() {
        // Constructeur par défaut
    }

    public Professeur(int id, String nom, String prenom, String matiereEnseignee) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matiereEnseignee = matiereEnseignee;
    }

    // Getters et Setters
    // Méthodes utilitaires (hashCode, equals, toString)
}
