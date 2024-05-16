package entities;

public class Bien {

    private int id;
    private String reference;
    private double prix;
    private String description;
    private double superficie;
    private String adresse;
    private static int nbreObjet;

    public Bien() {
        nbreObjet++;
        id = nbreObjet;
    }

    public Bien(String reference, double prix, String description, double superficie, String adresse) {
        nbreObjet++;
        id = nbreObjet;
        this.reference = reference;
        this.prix = prix;
        this.description = description;
        this.superficie = superficie;
        this.adresse = adresse;
    }

    // Getters et Setters
    // Méthodes utilitaires (superficieEnMetreCarre, hashCode, equals, toString)
}
