package fr.astro.uphf;

public abstract class Personne{
    public enum Genre {Homme, Femme};

    private int idPersonne;
    private String nom;
    private String prenom;
    private Genre genre;
    private String tel; 

    public Personne(int idPersonne, String nom, String prenom, Genre genre, String tel){
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.tel = tel;
    }

    public int getIdPersonne(){return idPersonne; }

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom = nom;}
    public String getPrenom(){return prenom;}
    public void setPrenom(String prenom){this.prenom = prenom;}
    public Genre getGenre(){return genre;}
    public void setGenre(Genre genre){this.genre = genre;}
    public String getTel(){return tel;}
    public void setTel(String tel){this.tel = tel;}

    public void afficherPersonne(){
        System.out.println("\n Id : " + this.idPersonne);
        System.out.println("\n Nom : " + this.nom);
        System.out.println("\n Prenom : " + this.prenom);
        System.out.println("\n Genre : " + this.genre);
        System.out.println("\n Tel : " + this.tel);
    }
}