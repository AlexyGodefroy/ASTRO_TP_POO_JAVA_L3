package fr.astro.uphf;

import java.util.Random;

public class Carte {
    private int x;
    private int y;

    public Carte(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Carte (int LARGEUR, int HAUTEUR, Random random){
        this.x = random.nextInt(LARGEUR);
        this.y = random.nextInt(HAUTEUR);
    }

    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
