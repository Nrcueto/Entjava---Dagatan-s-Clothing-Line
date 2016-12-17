package apc.entjava.photogallery.dao;

import apc.entjava.photogallery.businesslogic.ItemService;
import apc.entjava.photogallery.model.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Centi on 16/12/2016.
 */
public class ItemDao implements ItemService {

    private EntityManagerFactory emf;
    public ItemDao() {
        emf = Persistence.createEntityManagerFactory("PhotoGalleryDb");
    }

    @Override
    public void addItem(Item newItem) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(newItem);
            em.getTransaction().commit();
        } catch(Exception e) {
            em.getTransaction().rollback();
        }
        em.close();
    }
}
