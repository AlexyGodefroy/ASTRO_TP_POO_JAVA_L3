package fr.astro.uphf;

import java.util.random.RandomGenerator;
import java.util.ArrayList;

public class Operateur extends Personne{
    public enum Competences {Pilotage_rover, Pilotage_drone, Geologie, Telecommunication, Energie};

    private Competences competances;
    private int idOperateur;
    private int nbr_cadet;
    private int numero_mission;
    private ArrayList<Competences> listeCompetences = new ArrayList<>();

    //defini un tableau ou on met les competance dans un tableau et défini random pour generer un nombre aléatoire
    private static final Competences[] valeurs = Competences.values();
    private static final RandomGenerator random = RandomGenerator.getDefault();

    public Operateur(int idPersonne, String nom, String prenom, Genre genre, String tel, Competences competences,int idOperateur,int nbr_cadet,int numero_mission){
        //reprend les attributs de la classe mère
        super(idPersonne, nom, prenom, genre, tel);
        this.idOperateur = idOperateur;
        this.nbr_cadet = nbr_cadet;
        this.numero_mission =numero_mission;
        //génère la ou les compétance(s) aléatoire et les ajoutes à la liste de compétence de l'opérateur
        genererCompetencesAleatoires();
        this.competances = this.listeCompetences.get(0); 
    }

    //choisi une competance aleatoire parmis les competances dans l'enumeration Competances
    public static Competences comptetencealea(){
        return valeurs[random.nextInt(valeurs.length)];
    }

    //genere le nombre de competance et les ajoutes à la liste lié a l'operateur
    public void genererCompetencesAleatoires() {
        this.listeCompetences.clear();
        int nbCompetences = 1 + random.nextInt(3); // Donne 1, 2 ou 3

        while (this.listeCompetences.size() < nbCompetences) {
            ajouterCompetence(comptetencealea());
        }
    }

    //ajoute la compétance a la liste de competance
    public void ajouterCompetence(Competences c) {
        if (!this.listeCompetences.contains(c)) {
            this.listeCompetences.add(c);
        }
    }

    public Competences getCompetences(){return competances;}
    public void setCompetences(Competences competences){this.competances = competences;}
    public int getidOperateur(){return idOperateur;}
    public void setidOperateur(int idOperateur){ this.idOperateur = idOperateur;}// sert a rien car pas utilise
    public void setnbr_cadet(int nbr_cadet){ this.nbr_cadet = nbr_cadet;}
    public int getnbr_cadet(){return nbr_cadet;}
    public int getnumero_mission(){return numero_mission;}
    public void setnumero_mission(int numero_mission){ this.numero_mission = numero_mission;}


    
    
    public void afficherOperateur(){
        super.afficherPersonne();
        System.out.println("\n Competences : " + this.competances);
        System.out.println("\n Id Opérateur : " + this.idOperateur);
        System.out.println("\n Cadet en charge : " + getidOperateur());
        System.out.println("\n Numéro de mission affecter : "+ getnumero_mission());
    }
}