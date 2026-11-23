package fr.astro.uphf;

import java.util.Random;

public class Zone{
    private static final int LARGEUR = 11;
    private static final int HAUTEUR = 11;

    public enum terrain_zone {Plaine,Cratère,Falaise,Glace,};
    public enum Echantillon {Roche,Glace,Poussière,Masse};
    private int idzone;
    private Carte a;
    private Carte b;
    private terrain_zone typeterrain;
    private int interetscientifique;
    private Engin typevehicule;
    private Echantillon typeechantillon;
    
    public Zone(int idzone, terrain_zone typeterrain, int interetscientifique, Engin typevehicule, Echantillon typeechantillon, Random random){
        this.idzone = idzone;
        this.a= new Carte(LARGEUR, HAUTEUR, random);
        do {
            this.b = new Carte( LARGEUR,HAUTEUR,random);
        }while ( this.a.getX() == this.b.getX() && this.a.getY() == this.b.getY());

        this.typeterrain = typeterrain;
        this.interetscientifique = interetscientifique;
        this.typevehicule = typevehicule;
        this.typeechantillon = typeechantillon; 
    }

    public int getIdzone(){return idzone;}
    public void setIdzone(int idzone){this.idzone = idzone;}
    public Carte getA(){return a;}
    public void setA(Carte a){this.a = a;}
    public Carte getB(){return b;}
    public void setB(Carte b){this.b = b;}
    public terrain_zone getTypeterrain(){return typeterrain;}
    public void setTypeterrain(terrain_zone typeterrain){this.typeterrain = typeterrain;}
    public int getInteretscientifique(){return interetscientifique;}
    public void setInteretscientifique(int interetscientifique){this.interetscientifique = interetscientifique;}
    public Engin getTypevehicule(){return typevehicule;}
    public void setTypevehicule(Engin typevehicule){this.typevehicule = typevehicule;}
    public Echantillon getTypeechantillon(){return typeechantillon;}
    public void setTypeechantillon(Echantillon typeechantillon){this.typeechantillon = typeechantillon;}


    //public engin_autorisé(Engin vehicule){

    //}
    public void affichercarte(){
        System.out.println("\n Zone : " + this.idzone);
        System.err.println("\n Carte (point a) : " + this.a);
        System.err.println("\n Carte (point b) : " + this.b);
        System.out.println("\n Type de terrain : " + this.typeterrain);
        System.out.println("\n Intérêt scientifique : " + this.interetscientifique);
        System.out.println("\n Type de véhicule autorisé : " + this.typevehicule);
        System.out.println("\n Echantillon : " + this.typeechantillon);
    }

}