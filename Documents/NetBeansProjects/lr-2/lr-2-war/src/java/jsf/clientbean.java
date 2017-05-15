/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import meth.forClient;
import models.Client;

/**
 *
 * @author Настя
 */
@Named(value = "clientbean")
@SessionScoped
public class clientbean implements Serializable {

    @EJB
    private forClient forClient;
    
    private Client client;

private List<Client> clients;
    /**
     * Creates a new instance of clientbean
     */
     

    /**
     * @return the clients
     */
    public List<Client> getClients() {
        setClients(getForClient().getAll());
        return clients;
    }
    
    public String details(int id) {
       setClient(getForClient().getById(id));
        return "details";
    }

    /**
     * @param clients the clients to set
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * @return the forClient
     */
    public forClient getForClient() {
        return forClient;
    }

    /**
     * @param forClient the forClient to set
     */
    public void setForClient(forClient forClient) {
        this.forClient = forClient;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }
    
}
