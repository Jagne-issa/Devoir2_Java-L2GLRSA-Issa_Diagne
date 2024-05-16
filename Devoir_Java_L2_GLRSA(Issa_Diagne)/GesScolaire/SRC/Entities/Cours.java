import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Cours {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private Professeur professeur;
    private ArrayList<String> classes;
    private String module;

    public Cours(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, Professeur professeur, String module, ArrayList<String> classes) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.professeur = professeur;
        this.module = module;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public String getModule() {
        return module;
    }
}
