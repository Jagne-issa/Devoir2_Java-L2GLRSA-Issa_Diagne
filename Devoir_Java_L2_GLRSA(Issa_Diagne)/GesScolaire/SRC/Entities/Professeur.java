package entities;

public class Professeur {

    private int id;
    private String nom;
    private String prenom;
    private String matiereEnseignee;

    public Professeur() {
        // Constructeur par d�faut
    }

    public Professeur(int id, String nom, String prenom, String matiereEnseignee) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matiereEnseignee = matiereEnseignee;
    }

    // Getters et Setters
    // M�thodes utilitaires (hashCode, equals, toString)
}
