/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.persistencia;

import com.mycompany.proyecto.modelo.Aerolinea;
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
public class AerolineaJpaController implements Serializable {

    public AerolineaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    public AerolineaJpaController() {
        emf = Persistence.createEntityManagerFactory("AeropuertoPU");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Aerolinea aerolinea) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(aerolinea);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Aerolinea aerolinea) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            aerolinea = em.merge(aerolinea);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = aerolinea.getId();
                if (findAerolinea(id) == null) {
                    throw new NonexistentEntityException("The aerolinea with id " + id + " no longer exists.");
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
            Aerolinea aerolinea;
            try {
                aerolinea = em.getReference(Aerolinea.class, id);
                aerolinea.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The aerolinea with id " + id + " no longer exists.", enfe);
            }
            em.remove(aerolinea);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Aerolinea> findAerolineaEntities() {
        return findAerolineaEntities(true, -1, -1);
    }

    public List<Aerolinea> findAerolineaEntities(int maxResults, int firstResult) {
        return findAerolineaEntities(false, maxResults, firstResult);
    }

    private List<Aerolinea> findAerolineaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Aerolinea.class));
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

    public Aerolinea findAerolinea(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Aerolinea.class, id);
        } finally {
            em.close();
        }
    }

    public int getAerolineaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Aerolinea> rt = cq.from(Aerolinea.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
