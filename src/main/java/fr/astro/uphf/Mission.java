package fr.astro.uphf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mission {
    public enum StatutMission { PLANIFIEE, EN_COURS, TERMINEE }

    private int idMission;
    private String nom;
    private int budget;
    private Date dateLancement;
    private StatutMission statutMission;
    private Corps_celeste corpsCeleste;
    
    // Liste des zones qui sont les objectifs de la mission
    private List<Zone> zonesObjectifs;
    private int nombreTotalZonesInitial;

    public Mission(int idMission, String nom, int budget, Date dateLancement, Corps_celeste corpsCeleste) {
        this.idMission = idMission;
        this.nom = nom;
        this.budget = budget;
        this.dateLancement = dateLancement;
        this.statutMission = StatutMission.PLANIFIEE;
        this.corpsCeleste = corpsCeleste;
        this.zonesObjectifs = new ArrayList<>();
        
        if (corpsCeleste != null && corpsCeleste.getZones() != null) {
            this.zonesObjectifs.addAll(corpsCeleste.getZones());
        }
        this.nombreTotalZonesInitial = this.zonesObjectifs.size();
    }

    // Vérifie les zones et suppr de la liste ceux qui ont atteint 50%
    public void actualiserEtNettoyerZonesMission() {
        List<Zone> zonesASupprimer = new ArrayList<>();
        for (Zone zone : zonesObjectifs) {
            if (zone.estTerminee()) {
                zonesASupprimer.add(zone);
            }
        }
        zonesObjectifs.removeAll(zonesASupprimer);
    }

    // mission réussi si 70% des zones sont terminé
    public boolean estMissionReussie() {
        if (nombreTotalZonesInitial == 0) return false;
        int zonesTermineesCount = nombreTotalZonesInitial - zonesObjectifs.size();
        double ratio = (double) zonesTermineesCount / nombreTotalZonesInitial;
        return ratio >= 0.7;
    }

    // Getters et Setters
    public int getIdMission() { return idMission; }
    public void setIdMission(int idMission) { this.idMission = idMission; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getBudget() { return budget; }
    public void setBudget(int budget) { this.budget = budget; }

    public Date getDateLancement() { return dateLancement; }
    public void setDateLancement(Date dateLancement) { this.dateLancement = dateLancement; }

    public StatutMission getStatutMission() { return statutMission; }
    public void setStatutMission(StatutMission statutMission) { this.statutMission = statutMission; }

    public Corps_celeste getCorpsCeleste() { return corpsCeleste; }
    public void setCorpsCeleste(Corps_celeste corpsCeleste) { this.corpsCeleste = corpsCeleste; }

    public List<Zone> getZonesObjectifs() { return zonesObjectifs; }
}