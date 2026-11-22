package fr.astro.uphf;

public class Cadet extends Personne{
    private Operateur tuteur;
    private int mission_reussies;

    public Cadet(int idPersonne, String nom, String prenom, Genre genre, String tel, Operateur tuteur,int mission_reussies) {
        super(idPersonne, nom, prenom, genre, tel);
        this.tuteur = tuteur;
        this.mission_reussies = mission_reussies;
    }

    public Operateur get_tuteur(){return this.tuteur;}
    public void set_tuteur(Operateur tuteur){this.tuteur = tuteur;}
    public void setmission_reussies( int mission_reussies){ this.mission_reussies = mission_reussies;}
    public int getmission_reussies(){return mission_reussies;}
    public void ejouterunemissionreussis(){ mission_reussies ++;}

    public void afficherCadet(){
        super.afficherPersonne();
        System.out.println("Nom du tuteur : " + this.tuteur.getNom() );
        System.out.println("Prénom du tuteur : " + this.tuteur.getPrenom() );
    }
}