/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Myuser;

/**
 *
 * @author Настя
 */
@Stateless
public class MyuserFacade extends AbstractFacade<Myuser> {

    @PersistenceContext(unitName = "lr3-1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyuserFacade() {
        super(Myuser.class);
    }
    
}
