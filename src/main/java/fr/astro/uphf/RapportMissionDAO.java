
package fr.astro.uphf;

import jakarta.persistence.*;
import java.util.List;

public class RapportMissionDAO {

    private EntityManagerFactory emf;

    // Connexion à la base de données
    public RapportMissionDAO() {
        emf = Persistence.createEntityManagerFactory("astroPU");
    }

    // Enregistrer un rapport
    public void enregistrer(RapportMission rapport) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            em.persist(rapport);

            em.getTransaction().commit();

            System.out.println("Rapport enregistré avec succès !");

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            e.printStackTrace();

        } finally {
            em.close();
        }
    }

    // Récupérer tous les rapports
    public List<RapportMission> recupererTous() {

        EntityManager em = emf.createEntityManager();

        try {
            return em.createQuery(
                "SELECT r FROM RapportMission r",
                RapportMission.class
            ).getResultList();

        } finally {
            em.close();
        }
    }

    // Récupérer les rapports par corps céleste
    public List<RapportMission> recupererParCorpsCeleste(
            String corpsCeleste) {

        EntityManager em = emf.createEntityManager();

        try {
            return em.createQuery(
                "SELECT r FROM RapportMission r WHERE r.corpsCeleste = :corps",
                RapportMission.class
            )
            .setParameter("corps", corpsCeleste)
            .getResultList();

        } finally {
            em.close();
        }
    }

    // Fermer la connexion
    public void fermer() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
