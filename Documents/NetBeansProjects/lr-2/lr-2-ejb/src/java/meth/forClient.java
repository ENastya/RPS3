/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meth;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import models.Adress;
import models.Client;

/**
 *
 * @author Настя
 */
@Stateless
@LocalBean
public class forClient {
    
    private List <Client> result;
    private Client cl;
    
    public List<Client> getAll(){
       TypedQuery <Client> q = em.createQuery("SELECT c FROM Client c", Client.class);
       setResult(q.getResultList());
        return getResult();
}
    
    public Client getById(int id){
     TypedQuery <Client> q = em.createQuery("SELECT c FROM Client c WHERE c.id = :id", Client.class).setParameter("id", id); 
     setCl(q.getSingleResult());
     return getCl();
    }
    
    public EntityManager em = Persistence.createEntityManagerFactory("lr-2-ejbPU").createEntityManager();

    /**
     * @return the result
     */
    public List <Client> getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(List <Client> result) {
        this.result = result;
    }

    /**
     * @return the cl
     */
    public Client getCl() {
        return cl;
    }

    /**
     * @param cl the cl to set
     */
    public void setCl(Client cl) {
        this.cl = cl;
    }
    
}
