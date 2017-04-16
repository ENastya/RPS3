/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.MyuserRole;

/**
 *
 * @author Настя
 */
@Stateless
public class MyuserRoleFacade extends AbstractFacade<MyuserRole> {

    @PersistenceContext(unitName = "lr3-1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyuserRoleFacade() {
        super(MyuserRole.class);
    }
    
}
