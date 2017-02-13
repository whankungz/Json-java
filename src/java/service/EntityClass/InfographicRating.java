/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "InfographicRating", catalog = "SocialHerb_db", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InfographicRating.findAll", query = "SELECT i FROM InfographicRating i")
    , @NamedQuery(name = "InfographicRating.findByInfoRatID", query = "SELECT i FROM InfographicRating i WHERE i.infoRatID = :infoRatID")
    , @NamedQuery(name = "InfographicRating.findByRatingInfo", query = "SELECT i FROM InfographicRating i WHERE i.ratingInfo = :ratingInfo")
    , @NamedQuery(name = "InfographicRating.findByUsernameInfo", query = "SELECT i FROM InfographicRating i WHERE i.usernameInfo = :usernameInfo")})
public class InfographicRating implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "infoRatID")
    @Id
    private String infoRatID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ratingInfo")
    private double ratingInfo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usernameInfo")
    private String usernameInfo;
    @JoinColumn(name = "infoID", referencedColumnName = "infoID")
    @ManyToOne(optional = false)
    private Infographic infoID;

    public InfographicRating() {
    }

    public InfographicRating(String infoRatID) {
        this.infoRatID = infoRatID;
    }

    public InfographicRating(String infoRatID, double ratingInfo, String usernameInfo) {
        this.infoRatID = infoRatID;
        this.ratingInfo = ratingInfo;
        this.usernameInfo = usernameInfo;
    }

    public String getInfoRatID() {
        return infoRatID;
    }

    public void setInfoRatID(String infoRatID) {
        this.infoRatID = infoRatID;
    }

    public double getRatingInfo() {
        return ratingInfo;
    }

    public void setRatingInfo(double ratingInfo) {
        this.ratingInfo = ratingInfo;
    }

    public String getUsernameInfo() {
        return usernameInfo;
    }

    public void setUsernameInfo(String usernameInfo) {
        this.usernameInfo = usernameInfo;
    }

    public Infographic getInfoID() {
        return infoID;
    }

    public void setInfoID(Infographic infoID) {
        this.infoID = infoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infoRatID != null ? infoRatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfographicRating)) {
            return false;
        }
        InfographicRating other = (InfographicRating) object;
        if ((this.infoRatID == null && other.infoRatID != null) || (this.infoRatID != null && !this.infoRatID.equals(other.infoRatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.InfographicRating[ infoRatID=" + infoRatID + " ]";
    }
    
}
