package fr.astro.uphf;

public class Cadet extends Personne{
    private Operateur tuteur;

    public Cadet(int idPersonne, String nom, String prenom, Genre genre, String tel, Operateur tuteur) {
        super(idPersonne, nom, prenom, genre, tel); //l'id est stockee ds personne
        this.tuteur = tuteur;
    }

    Operateur get_tuteur(){return this.tuteur;}
    void set_tuteur(Operateur tuteur){this.tuteur = tuteur;}

    public void afficherCadet(){
        super.afficherPersonne();
        System.out.println("Nom du tuteur : " + this.tuteur.getNom() );
        System.out.println("Prénom du tuteur : " + this.tuteur.getPrenom() );
    }
}