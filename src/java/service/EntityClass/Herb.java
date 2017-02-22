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
import org.apache.struts2.json.annotations.JSON;

/**
 *
 * @author iamGG
 */
@Entity
@Table(name = "Herb", catalog = "SocialHerb_db", schema = "dbo")

@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//</editor-fold>
//@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "Herb.findAll", query = "SELECT h FROM Herb h")
    , @NamedQuery(name = "Herb.findByHerbID", query = "SELECT h FROM Herb h WHERE h.herbID = :herbID")
    , @NamedQuery(name = "Herb.findByDateHerb", query = "SELECT h FROM Herb h WHERE h.dateHerb = :dateHerb")})
public class Herb implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "herbID")
    @Id
    private String herbID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "herbName")
    private String herbName;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "herbOtherName")
    private String herbOtherName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "img")
    private byte[] img;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "howto")
    private String howto;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "warning")
    private String warning;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "properties")
    private String properties;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateHerb")
    @Temporal(TemporalType.DATE)
    private Date dateHerb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "herbID")
    private Collection<HerbImg> herbImgCollection;

    public Herb() {
    }

    public Herb(String herbID) {
        this.herbID = herbID;
    }

    public Herb(String herbID, String herbName, byte[] img, String howto, String warning, String properties, Date dateHerb) {
        this.herbID = herbID;
        this.herbName = herbName;
        this.img = img;
        this.howto = howto;
        this.warning = warning;
        this.properties = properties;
        this.dateHerb = dateHerb;
    }

    public String getHerbID() {
        return herbID;
    }

    public void setHerbID(String herbID) {
        this.herbID = herbID;
    }

    public String getHerbName() {
        return herbName;
    }

    public void setHerbName(String herbName) {
        this.herbName = herbName;
    }

    public String getHerbOtherName() {
        return herbOtherName;
    }

    public void setHerbOtherName(String herbOtherName) {
        this.herbOtherName = herbOtherName;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getHowto() {
        return howto;
    }

    public void setHowto(String howto) {
        this.howto = howto;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Date getDateHerb() {
        return dateHerb;
    }

    public void setDateHerb(Date dateHerb) {
        this.dateHerb = dateHerb;
    }

    @XmlTransient
    public Collection<HerbImg> getHerbImgCollection() {
        return herbImgCollection;
    }

    public void setHerbImgCollection(Collection<HerbImg> herbImgCollection) {
        this.herbImgCollection = herbImgCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (herbID != null ? herbID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Herb)) {
            return false;
        }
        Herb other = (Herb) object;
        if ((this.herbID == null && other.herbID != null) || (this.herbID != null && !this.herbID.equals(other.herbID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.Herb[ herbID=" + herbID + " ]";
    }
    
}
