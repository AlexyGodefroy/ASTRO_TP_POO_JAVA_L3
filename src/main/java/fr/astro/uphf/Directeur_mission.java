package fr.astro.uphf;

public class Directeur_mission extends Personne{
    private static int prochainId = 1;
    private int idDirecteur;
    private int mission_reussies = 0;
    private int nbr_mission;
    private float budget_mission = 0;
    public Directeur_mission(int idPersonne, String nom, String prenom, Genre genre, String tel,int nbr_mission) {
        super(nom, prenom, genre, tel);
        this.idDirecteur = prochainId();
        this.nbr_mission = nbr_mission;
    }


    public void ajouterunemissionreussis(Mission mission){ 
        if (mission.estMissionReussie()){
        mission_reussies ++;
        }
    }

    public static int prochainId(){return prochainId ++;}
    public void setidDirecteur(int idDirecteur){this.idDirecteur = idDirecteur;}
    public int getidDirecteur(){return idDirecteur;}
    public void setmission_reussies(int mission_reussies){ this.mission_reussies = mission_reussies;}
    public int getmission_reussies(){return mission_reussies;}
    public void setnbr_mission(int nbr_mission){ this.nbr_mission = nbr_mission;}
    public int getnbr_misison(){ return nbr_mission;}

    public void calculer_budget(Mission mission){
        budget_mission = budget_mission + mission.getBudget();

    }
    //public void switch mission(){}

    public void afficherDirecteur_mission(){
        super.afficherPersonne();
        System.out.println("\n L'immatricule du directeur est : " + getidDirecteur());
        System.out.println("\n Reussite de mission d'une valeur de : " + getmission_reussies() + " euros.");
        System.out.println("Nombre de mission affecté : " + getnbr_misison());

    }
}