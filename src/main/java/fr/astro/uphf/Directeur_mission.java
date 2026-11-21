package fr.astro.uphf;

public class Directeur_mission extends Personne{
    public Directeur_mission(int idPersonne, String nom, String prenom, Genre genre, String tel) {
        super(idPersonne, nom, prenom, genre, tel); //l'id est stockee ds personne
    }

    public void afficherDirecteur_mission(){
        super.afficherPersonne();
    }
}