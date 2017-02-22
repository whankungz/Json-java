/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author iamGG
 */
@Entity
@Table(name = "Disease", catalog = "SocialHerb_db", schema = "dbo")
@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disease.findAll", query = "SELECT d FROM Disease d")
    , @NamedQuery(name = "Disease.findByDiseaseID", query = "SELECT d FROM Disease d WHERE d.diseaseID = :diseaseID")
    , @NamedQuery(name = "Disease.findByDateDisease", query = "SELECT d FROM Disease d WHERE d.dateDisease = :dateDisease")})
public class Disease implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "diseaseID")
    @Id
    private String diseaseID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "diseaseName")
    private String diseaseName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Symptom")
    private String symptom;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "howtoRelief")
    private String howtoRelief;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateDisease")
    @Temporal(TemporalType.DATE)
    private Date dateDisease;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diseaseID")
    private Collection<DiseaseRating> diseaseRatingCollection;

    public Disease() {
    }

    public Disease(String diseaseID) {
        this.diseaseID = diseaseID;
    }

    public Disease(String diseaseID, String diseaseName, String symptom, String howtoRelief, Date dateDisease) {
        this.diseaseID = diseaseID;
        this.diseaseName = diseaseName;
        this.symptom = symptom;
        this.howtoRelief = howtoRelief;
        this.dateDisease = dateDisease;
    }

    public String getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(String diseaseID) {
        this.diseaseID = diseaseID;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getHowtoRelief() {
        return howtoRelief;
    }

    public void setHowtoRelief(String howtoRelief) {
        this.howtoRelief = howtoRelief;
    }

    public Date getDateDisease() {
        return dateDisease;
    }

    public void setDateDisease(Date dateDisease) {
        this.dateDisease = dateDisease;
    }

    @XmlTransient
    public Collection<DiseaseRating> getDiseaseRatingCollection() {
        return diseaseRatingCollection;
    }

    public void setDiseaseRatingCollection(Collection<DiseaseRating> diseaseRatingCollection) {
        this.diseaseRatingCollection = diseaseRatingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diseaseID != null ? diseaseID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disease)) {
            return false;
        }
        Disease other = (Disease) object;
        if ((this.diseaseID == null && other.diseaseID != null) || (this.diseaseID != null && !this.diseaseID.equals(other.diseaseID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.Disease[ diseaseID=" + diseaseID + " ]";
    }
    
}
