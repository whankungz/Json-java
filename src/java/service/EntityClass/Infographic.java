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
@Table(name = "Infographic", catalog = "SocialHerb_db", schema = "dbo")
@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Infographic.findAll", query = "SELECT i FROM Infographic i")
    , @NamedQuery(name = "Infographic.findByInfoID", query = "SELECT i FROM Infographic i WHERE i.infoID = :infoID")
    , @NamedQuery(name = "Infographic.findByDateInfo", query = "SELECT i FROM Infographic i WHERE i.dateInfo = :dateInfo")})
public class Infographic implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "infoID")
    @Id
    private String infoID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "infoName")
    private String infoName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "infoImg")
    private byte[] infoImg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateInfo")
    @Temporal(TemporalType.DATE)
    private Date dateInfo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "infoID")
    private Collection<InfographicRating> infographicRatingCollection;

    public Infographic() {
    }

    public Infographic(String infoID) {
        this.infoID = infoID;
    }

    public Infographic(String infoID, String infoName, byte[] infoImg, Date dateInfo) {
        this.infoID = infoID;
        this.infoName = infoName;
        this.infoImg = infoImg;
        this.dateInfo = dateInfo;
    }

    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public byte[] getInfoImg() {
        return infoImg;
    }

    public void setInfoImg(byte[] infoImg) {
        this.infoImg = infoImg;
    }

    public Date getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(Date dateInfo) {
        this.dateInfo = dateInfo;
    }

    @XmlTransient
    public Collection<InfographicRating> getInfographicRatingCollection() {
        return infographicRatingCollection;
    }

    public void setInfographicRatingCollection(Collection<InfographicRating> infographicRatingCollection) {
        this.infographicRatingCollection = infographicRatingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infoID != null ? infoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Infographic)) {
            return false;
        }
        Infographic other = (Infographic) object;
        if ((this.infoID == null && other.infoID != null) || (this.infoID != null && !this.infoID.equals(other.infoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.Infographic[ infoID=" + infoID + " ]";
    }
    
}
