public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected int anneeNaissance;
    protected String email;

    public Personne(String nom, String prenom, int anneeNaissance, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.email = email;
    }
    

    public abstract void sInscrire();

    public abstract void suivreCours();

    public abstract void passerExamen();

    public abstract void enseigner();

    public abstract void corrigerExamen();

    @Override
    public String toString() {
        return "Nom: " + nom + "\nPrénom: " + prenom + "\nAnnée de naissance: " + anneeNaissance + "\nEmail: " + email;
    }
}
