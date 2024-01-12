import java.util.Set;

public class Professeur extends Personne implements ProfesseurInterface {
    private Set<String> specialite;

    public Professeur(String nom, String prenom, int anneeNaissance, String email, Set<String> specialite) {
        super(nom, prenom, anneeNaissance, email);
        this.specialite = specialite;
    }

    @Override
    public void sInscrire() {

    }

    @Override
    public void suivreCours() {

    }

    @Override
    public void passerExamen() {

    }

    @Override
    public void enseigner() {
        System.out.println("Le professeur enseigne.");
    }

    @Override
    public void corrigerExamen() {
        System.out.println("Le professeur corrige un examen.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpécialité: " + specialite;
    }
}
