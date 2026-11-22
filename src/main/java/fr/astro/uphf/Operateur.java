package fr.astro.uphf;

public class Operateur extends Personne{
    public enum Competences {Pilotage_rover, Pilotage_drone, Geologie, Telecommunication, Energie};

    private Competences competances;
    private int idOperateur;
    private int nbr_cadet;
    private int numero_mission;

    public Operateur(int idPersonne, String nom, String prenom, Genre genre, String tel, Competences competences,int idOperateur,int nbr_cadet,int numero_mission){
        super(idPersonne, nom, prenom, genre, tel);
        this.competances = competences;
        this.idOperateur = idOperateur;
        this.nbr_cadet = nbr_cadet;
        this.numero_mission =numero_mission;
    }

    public Competences getCompetences(){return competances;}
    public void setCompetences(Competences competences){this.competances = competences;}
    public int getidOperateur(){return idOperateur;}
    public void setidOperateur(int idOperateur){ this.idOperateur = idOperateur;}// sert a rien car pas utilise
    public void setnbr_cadet(int nbr_cadet){ this.nbr_cadet = nbr_cadet;}
    public int getnbr_cadet(){return nbr_cadet;}
    public int getnumero_mission(){return numero_mission;}
    public void setnumero_mission(int numero_mission){ this.numero_mission = numero_mission;}


    //regarder pour faire la liste pour enumerer les competences si il y en a plusieurs
    
    public void afficherOperateur(){
        super.afficherPersonne();
        System.out.println("\n Competences : " + this.competances);
        System.out.println("\n Id Opérateur : " + this.idOperateur);
        System.out.println("\n Cadet en charge : " + getidOperateur());
        System.out.println("\n Numéro de mission affecter : "+ getnumero_mission());
    }
}