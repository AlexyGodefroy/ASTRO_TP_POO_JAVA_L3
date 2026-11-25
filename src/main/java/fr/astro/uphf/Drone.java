package fr.astro.uphf;

public class Drone extends Engin{
    private boolean cartographier;

    public Drone(int idEngin, String nom, int position, Etat_engin etat, boolean cartographier){
        super(idEngin, nom, position, etat);
        this.cartographier = cartographier;
    }

    public boolean getcartographier(){ return this.cartographier;}
    public void setcartographier(boolean cartographier){ this.cartographier = cartographier;}

    public void donnerAB(Zone zone){
        if (zone.isCartographieRealisee() == false ){
            System.out.println("\n Drone " + getIdEngin() + " connue sous le nom de " + getNom() + " vous donne le point a de la carte  " + zone.getA() + " et vous donne le point b de la carte " + zone.getB() +".");
            zone.setCartographieRealisee(true);
        }else{
            System.out.println("\n L'acces au pont a et b de la carte est impossible ou déjà effectuer.");
        }
    }

    
}
