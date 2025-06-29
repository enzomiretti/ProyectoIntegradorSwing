/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.persistencia;

import com.mycompany.proyecto.modelo.Aeropuerto;
import com.mycompany.proyecto.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Usuario
 */
public class AeropuertoJpaController implements Serializable {

    public AeropuertoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
   public AeropuertoJpaController() {
        emf = Persistence.createEntityManagerFactory("AeropuertoPU");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Aeropuerto aeropuerto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(aeropuerto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Aeropuerto aeropuerto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            aeropuerto = em.merge(aeropuerto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = aeropuerto.getId();
                if (findAeropuerto(id) == null) {
                    throw new NonexistentEntityException("The aeropuerto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Aeropuerto aeropuerto;
            try {
                aeropuerto = em.getReference(Aeropuerto.class, id);
                aeropuerto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The aeropuerto with id " + id + " no longer exists.", enfe);
            }
            em.remove(aeropuerto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Aeropuerto> findAeropuertoEntities() {
        return findAeropuertoEntities(true, -1, -1);
    }

    public List<Aeropuerto> findAeropuertoEntities(int maxResults, int firstResult) {
        return findAeropuertoEntities(false, maxResults, firstResult);
    }

    private List<Aeropuerto> findAeropuertoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Aeropuerto.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Aeropuerto findAeropuerto(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Aeropuerto.class, id);
        } finally {
            em.close();
        }
    }

    public int getAeropuertoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Aeropuerto> rt = cq.from(Aeropuerto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
