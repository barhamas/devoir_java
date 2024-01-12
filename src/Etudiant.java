public class Etudiant extends Personne implements EtudiantInterface {
    private String numeroEtudiant;
    private Classe classe;

    public Etudiant(String nom, String prenom, int anneeNaissance, String email, Classe classe) {
        super(nom, prenom, anneeNaissance, email);
        this.classe = classe;
        this.numeroEtudiant = nom + (nom.length() + anneeNaissance) + "000" + id;
    }

    @Override
    public void sInscrire() {
        System.out.println("L'étudiant s'inscrit.");
    }

    @Override
    public void suivreCours() {
        System.out.println("L'étudiant suit des cours.");
    }

    @Override
    public void passerExamen() {
        System.out.println("L'étudiant passe un examen.");
    }

    @Override
    public void enseigner() {

    }

    @Override
    public void corrigerExamen() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nNuméro étudiant: " + numeroEtudiant + "\nClasse: " + classe;
    }
}

