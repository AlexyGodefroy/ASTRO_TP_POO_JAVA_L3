package fr.astro.uphf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Corps_celeste {
    private String nom;
    private boolean atmosphere;
    private float vents;
    private List<Zone> zones;
    
    public Corps_celeste(String nom, boolean atmosphere){
        this.nom = nom;
        this.atmosphere = atmosphere;
        Random random = new Random();
        this.vents = random.nextInt(1000);
        this.zones = new ArrayList<>();
        
        // creation de nombre de zone aleatoire de 1 et 10 zone pour chaque corps celeste
        int nombreZones = 1 + random.nextInt(10); 
        for (int i = 1; i <= nombreZones; i++) {
            Zone zone = new Zone(i, random);
            this.zones.add(zone);
        }
    }

    public void setNom(String nom) { this.nom = nom; }
    public String getNom() { return nom; }
    
    public void setAtmosphere(boolean atmosphere) { this.atmosphere = atmosphere; }
    public boolean getAtmosphere() { return atmosphere; }
    
    public void setVents(float vents) { this.vents = vents; }
    public float getVents() { return vents; }

    public List<Zone> getZones() { return zones; }
}