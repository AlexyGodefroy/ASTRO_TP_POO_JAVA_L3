package fr.astro.uphf;

public class Directeur_mission extends Personne{
    private int idDirecteur;
    private int mission_reussies;
    private int nbr_mission;
    public Directeur_mission(int idPersonne, String nom, String prenom, Genre genre, String tel,int idDirecteur, int mission_reussies,int nbr_mission) {
        super(idPersonne, nom, prenom, genre, tel);
        this.idDirecteur = idDirecteur;
        this.mission_reussies = mission_reussies;
        this.nbr_mission = nbr_mission;
    }


    public void setidDirecteur(int idDirecteur){this.idDirecteur = idDirecteur;}
    public int getidDirecteur(){return idDirecteur;}
    public void setmission_reussies(int mission_reussies){ this.mission_reussies = mission_reussies;}
    public int getmission_reussies(){return mission_reussies;}
    public void setnbr_mission(int nbr_mission){ this.nbr_mission = nbr_mission;}
    public int getnbr_misison(){ return nbr_mission;}

    //public float calculer_budget(){}
    //public void switch mission(){}

    public void afficherDirecteur_mission(){
        super.afficherPersonne();
        System.out.println("\n L'immatricule du directeur est : " + getidDirecteur());
        System.out.println("\n Reussite de mission d'une valeur de : " + getmission_reussies() + " euros.");
        System.out.println("Nombre de mission affecté : " + getnbr_misison());

    }
}