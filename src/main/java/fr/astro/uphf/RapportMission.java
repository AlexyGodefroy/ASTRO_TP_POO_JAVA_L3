
package fr.astro.uphf;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rapports_mission")
public class RapportMission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomMission;
    private Date date;
    private String corpsCeleste;
    private int nombreZonesExplorees;
    private int nombreEchantillons;
    private double interetScientifiqueTotal;
    private boolean reussite;
    private double budget;

    public RapportMission() {
    }

    public RapportMission(String nomMission, Date date, String corpsCeleste, int nombreZonesExplorees,  int nombreEchantillons, double interetScientifiqueTotal, boolean reussite, double budget) {
        this.nomMission = nomMission;
        this.date = date;
        this.corpsCeleste = corpsCeleste;
        this.nombreZonesExplorees = nombreZonesExplorees;
        this.nombreEchantillons = nombreEchantillons;
        this.interetScientifiqueTotal = interetScientifiqueTotal;
        this.reussite = reussite;
        this.budget = budget;
    }

    public Long getId() {
        return id;
    }

    public String getNomMission() {
        return nomMission;
    }

    public Date getDate() {
        return date;
    }

    public String getCorpsCeleste() {
        return corpsCeleste;
    }

    public int getNombreZonesExplorees() {
        return nombreZonesExplorees;
    }

    public int getNombreEchantillons() {
        return nombreEchantillons;
    }

    public double getInteretScientifiqueTotal() {
        return interetScientifiqueTotal;
    }

    public boolean isReussite() {
        return reussite;
    }

    public double getBudget() {
        return budget;
    }
}
