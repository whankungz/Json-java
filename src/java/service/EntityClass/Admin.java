/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author iamGG
 */
@Entity
@Table(name = "Admin", catalog = "SocialHerb_db", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findByUsernameAd", query = "SELECT a FROM Admin a WHERE a.usernameAd = :usernameAd")
    , @NamedQuery(name = "Admin.findByPasswordAd", query = "SELECT a FROM Admin a WHERE a.passwordAd = :passwordAd")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usernameAd")
    @Id
    private String usernameAd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "passwordAd")
    private String passwordAd;

    public Admin() {
    }

    public Admin(String usernameAd) {
        this.usernameAd = usernameAd;
    }

    public Admin(String usernameAd, String passwordAd) {
        this.usernameAd = usernameAd;
        this.passwordAd = passwordAd;
    }

    public String getUsernameAd() {
        return usernameAd;
    }

    public void setUsernameAd(String usernameAd) {
        this.usernameAd = usernameAd;
    }

    public String getPasswordAd() {
        return passwordAd;
    }

    public void setPasswordAd(String passwordAd) {
        this.passwordAd = passwordAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usernameAd != null ? usernameAd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.usernameAd == null && other.usernameAd != null) || (this.usernameAd != null && !this.usernameAd.equals(other.usernameAd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.Admin[ usernameAd=" + usernameAd + " ]";
    }
    
}
