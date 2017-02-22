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
@Table(name = "DiseaseRating", catalog = "SocialHerb_db", schema = "dbo")
@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiseaseRating.findAll", query = "SELECT d FROM DiseaseRating d")
    , @NamedQuery(name = "DiseaseRating.findByDiRatID", query = "SELECT d FROM DiseaseRating d WHERE d.diRatID = :diRatID")
    , @NamedQuery(name = "DiseaseRating.findByRatingDi", query = "SELECT d FROM DiseaseRating d WHERE d.ratingDi = :ratingDi")
    , @NamedQuery(name = "DiseaseRating.findByUsernameDi", query = "SELECT d FROM DiseaseRating d WHERE d.usernameDi = :usernameDi")})
public class DiseaseRating implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "diRatID")
    @Id
    private String diRatID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ratingDi")
    private double ratingDi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usernameDi")
    private String usernameDi;
    @JoinColumn(name = "diseaseID", referencedColumnName = "diseaseID")
    @ManyToOne(optional = false)
    private Disease diseaseID;

    public DiseaseRating() {
    }

    public DiseaseRating(String diRatID) {
        this.diRatID = diRatID;
    }

    public DiseaseRating(String diRatID, double ratingDi, String usernameDi) {
        this.diRatID = diRatID;
        this.ratingDi = ratingDi;
        this.usernameDi = usernameDi;
    }

    public String getDiRatID() {
        return diRatID;
    }

    public void setDiRatID(String diRatID) {
        this.diRatID = diRatID;
    }

    public double getRatingDi() {
        return ratingDi;
    }

    public void setRatingDi(double ratingDi) {
        this.ratingDi = ratingDi;
    }

    public String getUsernameDi() {
        return usernameDi;
    }

    public void setUsernameDi(String usernameDi) {
        this.usernameDi = usernameDi;
    }

    public Disease getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(Disease diseaseID) {
        this.diseaseID = diseaseID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diRatID != null ? diRatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiseaseRating)) {
            return false;
        }
        DiseaseRating other = (DiseaseRating) object;
        if ((this.diRatID == null && other.diRatID != null) || (this.diRatID != null && !this.diRatID.equals(other.diRatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.DiseaseRating[ diRatID=" + diRatID + " ]";
    }
    
}
