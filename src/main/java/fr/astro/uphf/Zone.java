package fr.astro.uphf;

import java.util.Random;
import java.util.Scanner;

public class Zone {
    private static final int LARGEUR = 11;
    private static final int HAUTEUR = 11;
    private static final Scanner scanner = new Scanner(System.in);

    public enum Terrain_zone { Plaine, Cratère, Falaise, Glace }
    public enum Echantillon { Roche, Glace, Poussière }

    private int idzone;
    private Carte a;
    private Carte b;
    private Terrain_zone typeterrain;
    private int interetscientifique;
    private Echantillon typeechantillon;
    
    private boolean exploreeParRover = false;
    private boolean exploreeParDrone = false;
    
    // Système de points de la zone (Total 100%)
    private boolean echantillonPreleve = false;      // 20%
    private boolean cartographieRealisee = false;   // 30%
    private boolean calculOperateurReussi = false;  // 50%

    public Zone(int idzone, Random random){
        this.idzone = idzone;
        this.a = new Carte(LARGEUR, HAUTEUR, random);
        do {
            this.b = new Carte(LARGEUR, HAUTEUR, random);
        } while (this.a.getX() == this.b.getX() && this.a.getY() == this.b.getY());

        Terrain_zone[] terrains = Terrain_zone.values();
        this.typeterrain = terrains[random.nextInt(terrains.length)];

        this.interetscientifique = random.nextInt(11);

        // Choix aléatoire de l'échantillon
        Echantillon[] echantillons = Echantillon.values();
        this.typeechantillon = echantillons[random.nextInt(echantillons.length)];
    }

    


    public int getPourcentageCompletion() {
        int total = 0;
        if (echantillonPreleve) total += 20;
        if (cartographieRealisee) total += 30;
        if (calculOperateurReussi) total += 50;
        return total;
    }


    public boolean estTerminee() {
        return getPourcentageCompletion() >= 50;
    }


    public boolean effectuerCalculOperateur(int valeurChoisie, int valeurCible) {
        if (valeurChoisie == valeurCible) {
            this.calculOperateurReussi = true;
            return true;
        }
        return false;
    }

    public boolean passageprochainezone(Corps_celeste corps_celeste, Operateur operateur) {
        int prochaine = corps_celeste.donnerprochainezone();
        if (prochaine == -1) {
            System.out.println("\n Aucune zone disponible.");
            return false;
        }

        System.out.println("\n Pour passer à la prochaine zone, résolvez ceci :");
        System.out.println("\n La prochaine zone est " + prochaine + " et votre zone est " + idzone);
        System.out.println("\n Opérateur " + operateur.getidOperateur() + ", choisissez une opération entre + et - :");
        String operation = scanner.next();
        while (!operation.equals("+") && !operation.equals("-")) {
            System.out.println("\n Opération invalide, tapez + ou - :");
            operation = scanner.next();
        }

        System.out.println("\n Choisissez un nombre :");
        while (!scanner.hasNextInt()) {
            System.out.println("\n Ce n'est pas un nombre, recommencez :");
            scanner.next();
        }
        int nbr = scanner.nextInt();
        int resultat = operation.equals("+") ? idzone + nbr : idzone - nbr;

        return effectuerCalculOperateur(resultat, prochaine);
    }
    // note a moi meme; la prochaine fois faire une fonction qui suppr de la liste la zone terminer et passe a la prochaine

    public int getIdzone() { return idzone; }
    public void setIdzone(int idzone) { this.idzone = idzone; }
    
    public Carte getA() { return a; }
    public void setA(Carte a) { this.a = a; }
    
    public Carte getB() { return b; }
    public void setB(Carte b) { this.b = b; }
    
    public Terrain_zone getTypeterrain() { return typeterrain; }
    public void setTypeterrain(Terrain_zone typeterrain) { this.typeterrain = typeterrain; }
    
    public int getInteretscientifique() { return interetscientifique; }
    public void setInteretscientifique(int interetscientifique) { this.interetscientifique = interetscientifique; }
    
    public Echantillon getTypeechantillon() { return typeechantillon; }
    public void setTypeechantillon(Echantillon typeechantillon) { this.typeechantillon = typeechantillon; }

    public boolean isExploreeParRover() { return exploreeParRover; }
    public void setExploreeParRover(boolean exploreeParRover) { 
        this.exploreeParRover = exploreeParRover;
        if (exploreeParRover) {
            this.echantillonPreleve = true; // 20%
        }
    }

    public boolean isExploreeParDrone() { return exploreeParDrone; }
    public void setExploreeParDrone(boolean exploreeParDrone) { 
        this.exploreeParDrone = exploreeParDrone;
        if (exploreeParDrone) {
            this.cartographieRealisee = true; // 30%
        }
    }

    public boolean isEchantillonPreleve() { return echantillonPreleve; }
    public void setEchantillonPreleve(boolean echantillonPreleve) { this.echantillonPreleve = echantillonPreleve; }

    public boolean isCartographieRealisee() { return cartographieRealisee; }
    public void setCartographieRealisee(boolean cartographieRealisee) { this.cartographieRealisee = cartographieRealisee; }

    public boolean isCalculOperateurReussi() { return calculOperateurReussi; }
    public void setCalculOperateurReussi(boolean calculOperateurReussi) { this.calculOperateurReussi = calculOperateurReussi; }
}