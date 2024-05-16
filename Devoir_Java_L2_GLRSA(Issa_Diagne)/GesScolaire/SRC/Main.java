import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Créer un objet Professeur
        Professeur prof = new Professeur("John", "Doe", "Math");

        // Créer un objet ArrayList pour les classes
        ArrayList<String> classes = new ArrayList<>();
        classes.add("Math");
        classes.add("Physics");

        // Créer un objet Cours
        Cours cours = new Cours(1, LocalDate.now(), LocalTime.of(9, 0), LocalTime.of(11, 0), prof, "Algebra", classes);

        // Afficher les informations sur le cours
        System.out.println("ID du cours : " + cours.getId());
        System.out.println("Date du cours : " + cours.getDate());
        System.out.println("Heure de début du cours : " + cours.getHeureDebut());
        System.out.println("Heure de fin du cours : " + cours.getHeureFin());
        System.out.println("Professeur du cours : " + cours.getProfesseur().getNom());
        System.out.println("Module du cours : " + cours.getModule());
        System.out.println("Classes du cours : " + cours.getClasses());
    }
}
