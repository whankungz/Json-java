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
import javax.persistence.Lob;
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
@Table(name = "HerbResearch", catalog = "SocialHerb_db", schema = "dbo")
@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HerbResearch.findAll", query = "SELECT h FROM HerbResearch h")
    , @NamedQuery(name = "HerbResearch.findByResearchID", query = "SELECT h FROM HerbResearch h WHERE h.researchID = :researchID")
    , @NamedQuery(name = "HerbResearch.findByHerbIdRe", query = "SELECT h FROM HerbResearch h WHERE h.herbIdRe = :herbIdRe")})
public class HerbResearch implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "researchID")
    @Id
    private String researchID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "researchName")
    private String researchName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "creditRe")
    private String creditRe;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "link")
    private String link;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "herbIdRe")
    private String herbIdRe;

    public HerbResearch() {
    }

    public HerbResearch(String researchID) {
        this.researchID = researchID;
    }

    public HerbResearch(String researchID, String researchName, String creditRe, String link, String herbIdRe) {
        this.researchID = researchID;
        this.researchName = researchName;
        this.creditRe = creditRe;
        this.link = link;
        this.herbIdRe = herbIdRe;
    }

    public String getResearchID() {
        return researchID;
    }

    public void setResearchID(String researchID) {
        this.researchID = researchID;
    }

    public String getResearchName() {
        return researchName;
    }

    public void setResearchName(String researchName) {
        this.researchName = researchName;
    }

    public String getCreditRe() {
        return creditRe;
    }

    public void setCreditRe(String creditRe) {
        this.creditRe = creditRe;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHerbIdRe() {
        return herbIdRe;
    }

    public void setHerbIdRe(String herbIdRe) {
        this.herbIdRe = herbIdRe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (researchID != null ? researchID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HerbResearch)) {
            return false;
        }
        HerbResearch other = (HerbResearch) object;
        if ((this.researchID == null && other.researchID != null) || (this.researchID != null && !this.researchID.equals(other.researchID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.HerbResearch[ researchID=" + researchID + " ]";
    }
    
}
