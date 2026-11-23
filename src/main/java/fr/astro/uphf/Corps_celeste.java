package fr.astro.uphf;

import java.util.Random;

public class Corps_celeste{
    private String nom;
    private boolean atmosphere;
    private float vents;
    
    public Corps_celeste(String nom, boolean atmosphere){
        this.nom = nom;
        this.atmosphere = atmosphere;
        Random random = new Random();
        this.vents = random.nextInt(1000);
    }



    public void setnom(String nom){this.nom = nom;}
    public String getnom(){return nom;}
    public void setatmosphere(boolean atmosphere){this.atmosphere = atmosphere;}
    public boolean getatmosphere(){ return atmosphere;}
    public void setvents(float vents){this.vents = vents;}
    public float getvents(){return vents;}



}
