package fr.astro.uphf;


public class Rover extends Engin{
    private boolean preleve;

    public Rover(int idEngin, String nom, int position, Etat_engin etat, boolean preleve){
        super(idEngin, nom, position, etat);
        this.preleve = preleve;
    }

    public boolean getpreleve(){return this.preleve;}
    public void setpreleve( boolean preleve){ this.preleve = preleve;}

    public void sortirechantillon(Zone zone){
        if( getpreleve() == true){
            System.out.println("\n Rover " + getIdEngin() + " connue sous le nom de " + getNom() + " à prélevé un échantillon de " + zone.getTypeechantillon() +".");
        }else{
            System.out.println("\n Le prélevement est impossible.");
        }
    }
}
