import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();

        Etudiant etudiant1 = new Etudiant("sow", "barhama", 1998, "barhamaspw97@gmail.com", Classe.L3);
        Etudiant etudiant2 = new Etudiant("diallo", "mariata", 2002, "tamariadiallo@gmail.com", Classe.M1);
        Etudiant etudiant3 = new Etudiant("ba", "zeynba", 2000, "zeynababa@gmail.com", Classe.M2);

        Set<String> specialite1 = new HashSet<>();
        specialite1.add("JAVA");
        specialite1.add("PHP");

        Set<String> specialite2 = new HashSet<>();
        specialite2.add("C#");

        Professeur professeur1 = new Professeur("seye", "ousmane", 1999, "ousmane.seye@email.com", specialite1);
        Professeur professeur2 = new Professeur("diop", "Alioune", 1999, "alioune.diop@email.com", specialite2);
        Professeur professeur3 = new Professeur("ly", "Saratou", 1999, "Saratou.ly@email.com", specialite1);

        personnes.add(etudiant1);
        personnes.add(etudiant2);
        personnes.add(etudiant3);
        personnes.add(professeur1);
        personnes.add(professeur2);
        personnes.add(professeur3);

        for (Personne personne : personnes) {
            System.out.println(personne.toString());
            System.out.println("----------------");
        }
    }
}
