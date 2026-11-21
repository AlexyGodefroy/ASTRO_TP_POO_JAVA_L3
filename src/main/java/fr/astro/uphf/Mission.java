package fr.astro.uphf;

import java.util.Date;

public class Mission{
    private  int idMission;
    private String nom;
    private String prenom;
    private int budget;
    private Date dateLancement;
    private String statutMission;

    public Mission(int idMission, String nom, String prenom, int budget, Date dateLancement, String statutMission){
        this.idMission = idMission;
        this.nom = nom;
        this.prenom = prenom;
        this.budget = budget;
        this.dateLancement = dateLancement; 
        this.statutMission = statutMission;
    }

    public int getIdMission(){return idMission;}
    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}
    public String getPrenom(){return prenom;}
    public void setPrenom(String prenom){this.prenom = prenom;} 
    public int getBudget(){return budget;}
    public void setBudget(int budget){this.budget = budget;}
    public Date getDateLancement(){return dateLancement;}
    public void setDateLancement(Date dateLancement){this.dateLancement = dateLancement;}
    public String getStatutMission(){return statutMission;}
    public void setStatutMission(String statutMission){this.statutMission = statutMission;}

    
}