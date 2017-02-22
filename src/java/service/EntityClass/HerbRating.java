/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author iamGG
 */
@Entity
@Table(name = "HerbRating", catalog = "SocialHerb_db", schema = "dbo")
@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HerbRating.findAll", query = "SELECT h FROM HerbRating h")
    , @NamedQuery(name = "HerbRating.findByHerbRatID", query = "SELECT h FROM HerbRating h WHERE h.herbRatID = :herbRatID")
    , @NamedQuery(name = "HerbRating.findByRatingHerb", query = "SELECT h FROM HerbRating h WHERE h.ratingHerb = :ratingHerb")
    , @NamedQuery(name = "HerbRating.findByHerbIdRat", query = "SELECT h FROM HerbRating h WHERE h.herbIdRat = :herbIdRat")
    , @NamedQuery(name = "HerbRating.findByUsernameRat", query = "SELECT h FROM HerbRating h WHERE h.usernameRat = :usernameRat")
    , @NamedQuery(name = "HerbRating.findByDateHerbRat", query = "SELECT h FROM HerbRating h WHERE h.dateHerbRat = :dateHerbRat")})
public class HerbRating implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "herbRatID")
    @Id
    private String herbRatID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ratingHerb")
    private double ratingHerb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "herbIdRat")
    private String herbIdRat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usernameRat")
    private String usernameRat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateHerbRat")
    @Temporal(TemporalType.DATE)
    private Date dateHerbRat;

    public HerbRating() {
    }

    public HerbRating(String herbRatID) {
        this.herbRatID = herbRatID;
    }

    public HerbRating(String herbRatID, double ratingHerb, String herbIdRat, String usernameRat, Date dateHerbRat) {
        this.herbRatID = herbRatID;
        this.ratingHerb = ratingHerb;
        this.herbIdRat = herbIdRat;
        this.usernameRat = usernameRat;
        this.dateHerbRat = dateHerbRat;
    }

    public String getHerbRatID() {
        return herbRatID;
    }

    public void setHerbRatID(String herbRatID) {
        this.herbRatID = herbRatID;
    }

    public double getRatingHerb() {
        return ratingHerb;
    }

    public void setRatingHerb(double ratingHerb) {
        this.ratingHerb = ratingHerb;
    }

    public String getHerbIdRat() {
        return herbIdRat;
    }

    public void setHerbIdRat(String herbIdRat) {
        this.herbIdRat = herbIdRat;
    }

    public String getUsernameRat() {
        return usernameRat;
    }

    public void setUsernameRat(String usernameRat) {
        this.usernameRat = usernameRat;
    }

    public Date getDateHerbRat() {
        return dateHerbRat;
    }

    public void setDateHerbRat(Date dateHerbRat) {
        this.dateHerbRat = dateHerbRat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (herbRatID != null ? herbRatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HerbRating)) {
            return false;
        }
        HerbRating other = (HerbRating) object;
        if ((this.herbRatID == null && other.herbRatID != null) || (this.herbRatID != null && !this.herbRatID.equals(other.herbRatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.HerbRating[ herbRatID=" + herbRatID + " ]";
    }
    
}
