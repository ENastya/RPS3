/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Настя
 */
@Entity
@Table(name = "myuser_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MyuserRole.findAll", query = "SELECT m FROM MyuserRole m"),
    @NamedQuery(name = "MyuserRole.findByUsername", query = "SELECT m FROM MyuserRole m WHERE m.myuserRolePK.username = :username"),
    @NamedQuery(name = "MyuserRole.findByRole", query = "SELECT m FROM MyuserRole m WHERE m.myuserRolePK.role = :role")})
public class MyuserRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MyuserRolePK myuserRolePK;
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Myuser myuser;

    public MyuserRole() {
    }

    public MyuserRole(MyuserRolePK myuserRolePK) {
        this.myuserRolePK = myuserRolePK;
    }

    public MyuserRole(String username, String role) {
        this.myuserRolePK = new MyuserRolePK(username, role);
    }

    public MyuserRolePK getMyuserRolePK() {
        return myuserRolePK;
    }

    public void setMyuserRolePK(MyuserRolePK myuserRolePK) {
        this.myuserRolePK = myuserRolePK;
    }

    public Myuser getMyuser() {
        return myuser;
    }

    public void setMyuser(Myuser myuser) {
        this.myuser = myuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (myuserRolePK != null ? myuserRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MyuserRole)) {
            return false;
        }
        MyuserRole other = (MyuserRole) object;
        if ((this.myuserRolePK == null && other.myuserRolePK != null) || (this.myuserRolePK != null && !this.myuserRolePK.equals(other.myuserRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.MyuserRole[ myuserRolePK=" + myuserRolePK + " ]";
    }
    
}
