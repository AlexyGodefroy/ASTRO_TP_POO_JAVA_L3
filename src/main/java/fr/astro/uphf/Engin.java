package fr.astro.uphf;

public abstract class Engin{
    public enum Etat_engin {Disponible, En_mission, En_panne};
    public enum Capacite {deplacer, prelever, cartographier};

    private int idEngin;
    private String nom;
    private int position;
    private Etat_engin etat;
    private Capacite capacite;

    public Engin(int idEngin, String nom, int position, Etat_engin etat){
        this.idEngin = idEngin;
        this.nom = nom;
        this.position = position;
        this.etat = etat;
        
    }

    public int getIdEngin(){return idEngin;}
    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}
    public int getPosition(){return position;}
    public void setPosition(int position){this.position = position;}
    public Etat_engin getEtat(){return etat;}
    public void setEtat(Etat_engin etat){this.etat = etat;}
    public Capacite getCapacite(){return capacite;}
    public void setCapacite(Capacite capacite){this.capacite = capacite;}

}