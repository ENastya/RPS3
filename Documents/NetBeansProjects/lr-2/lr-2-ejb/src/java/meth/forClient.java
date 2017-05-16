package meth;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import models.Client;

/**
 *
 * @author Настя
 */
@Stateless
@LocalBean
public class forClient {
    
    public List<Client> getAll(){
       TypedQuery <Client> q = em.createQuery("SELECT c FROM Client c", Client.class);
        return q.getResultList();
}
    public Client getById(int id){
     TypedQuery <Client> q = em.createQuery("SELECT c FROM Client c WHERE c.id = :id", Client.class).setParameter("id", id); 
     return q.getSingleResult();
    }
    
    public EntityManager em = Persistence.createEntityManagerFactory("lr-2-ejbPU").createEntityManager();

}
