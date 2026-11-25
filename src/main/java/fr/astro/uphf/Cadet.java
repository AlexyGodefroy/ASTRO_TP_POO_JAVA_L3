package fr.astro.uphf;

public class Cadet extends Personne{
    private Operateur tuteur;
    private int mission_reussies;
    private boolean promu = false;

    public Cadet(int idPersonne, String nom, String prenom, Genre genre, String tel, Operateur tuteur,int mission_reussies,boolean promu) {
        super(nom, prenom, genre, tel);
        this.tuteur = tuteur;
        this.mission_reussies = mission_reussies;
        this.promu = promu;
    }

    public Operateur get_tuteur(){return this.tuteur;}
    public void set_tuteur(Operateur tuteur){this.tuteur = tuteur;}
    public void setmission_reussies( int mission_reussies){ this.mission_reussies = mission_reussies;}
    public int getmission_reussies(){return mission_reussies;}

    public void ajouterunemissionreussis(Mission mission){ 
        if (mission.estMissionReussie()){
        mission_reussies ++;
        }
    }
    
    public void cadet_en_op(){
        if(mission_reussies == 3){

        }
    }
    
    // Remplace cadet_en_op() : renvoie le nouvel opérateur, ou null si pas encore promouvable
    public Operateur cadetEnOp() {
        if (mission_reussies < 3 || tuteur == null) {
            return null;
        }

        Operateur nouveau = new Operateur(
                getIdPersonne(), getNom(), getPrenom(), getGenre(), getTel(),
                tuteur.getListeCompetences());

        tuteur.setnbr_cadet(tuteur.getnbr_cadet() - 1);
        this.promu=true;
        return nouveau;
    }
    public boolean getestpromu(){return promu;}
    public void setestpromu(boolean promu){this.promu=promu;}

    public void afficherCadet(){
        super.afficherPersonne();
        System.out.println("Nom du tuteur : " + this.tuteur.getNom() );
        System.out.println("Prénom du tuteur : " + this.tuteur.getPrenom() );
    }
    
}