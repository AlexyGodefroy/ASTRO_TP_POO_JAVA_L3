package fr.astro.uphf;

public class Operateur extends Personne{
    public enum Competences {Pilotage_rover, Pilotage_drone, Geologie, Telecommunication, Energie};

    private Competences competances;

    public Operateur(int idPersonne, String nom, String prenom, Genre genre, String tel, Competences competences) {
        super(idPersonne, nom, prenom, genre, tel); //l'id est stockee ds personne
        this.competances = competences;
    }

    public Competences getCompetences(){return competances;}
    public void setCompetences(Competences competences){this.competances = competences;}

    public void afficherOperateur(){
        super.afficherPersonne();
        System.out.println("Competences : " + this.competances);
    }
}