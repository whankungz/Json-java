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
import javax.persistence.Lob;
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
@Table(name = "HerbComment", catalog = "SocialHerb_db", schema = "dbo")
@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HerbComment.findAll", query = "SELECT h FROM HerbComment h")
    , @NamedQuery(name = "HerbComment.findByHerbCommentID", query = "SELECT h FROM HerbComment h WHERE h.herbCommentID = :herbCommentID")
    , @NamedQuery(name = "HerbComment.findByHerbIdCom", query = "SELECT h FROM HerbComment h WHERE h.herbIdCom = :herbIdCom")
    , @NamedQuery(name = "HerbComment.findByUsernameHerbCom", query = "SELECT h FROM HerbComment h WHERE h.usernameHerbCom = :usernameHerbCom")
    , @NamedQuery(name = "HerbComment.findByDateHerbCom", query = "SELECT h FROM HerbComment h WHERE h.dateHerbCom = :dateHerbCom")})
public class HerbComment implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "herbCommentID")
    @Id
    private String herbCommentID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "herbComment")
    private String herbComment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "herbIdCom")
    private String herbIdCom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usernameHerbCom")
    private String usernameHerbCom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateHerbCom")
    @Temporal(TemporalType.DATE)
    private Date dateHerbCom;

    public HerbComment() {
    }

    public HerbComment(String herbCommentID) {
        this.herbCommentID = herbCommentID;
    }

    public HerbComment(String herbCommentID, String herbComment, String herbIdCom, String usernameHerbCom, Date dateHerbCom) {
        this.herbCommentID = herbCommentID;
        this.herbComment = herbComment;
        this.herbIdCom = herbIdCom;
        this.usernameHerbCom = usernameHerbCom;
        this.dateHerbCom = dateHerbCom;
    }

    public String getHerbCommentID() {
        return herbCommentID;
    }

    public void setHerbCommentID(String herbCommentID) {
        this.herbCommentID = herbCommentID;
    }

    public String getHerbComment() {
        return herbComment;
    }

    public void setHerbComment(String herbComment) {
        this.herbComment = herbComment;
    }

    public String getHerbIdCom() {
        return herbIdCom;
    }

    public void setHerbIdCom(String herbIdCom) {
        this.herbIdCom = herbIdCom;
    }

    public String getUsernameHerbCom() {
        return usernameHerbCom;
    }

    public void setUsernameHerbCom(String usernameHerbCom) {
        this.usernameHerbCom = usernameHerbCom;
    }

    public Date getDateHerbCom() {
        return dateHerbCom;
    }

    public void setDateHerbCom(Date dateHerbCom) {
        this.dateHerbCom = dateHerbCom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (herbCommentID != null ? herbCommentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HerbComment)) {
            return false;
        }
        HerbComment other = (HerbComment) object;
        if ((this.herbCommentID == null && other.herbCommentID != null) || (this.herbCommentID != null && !this.herbCommentID.equals(other.herbCommentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.HerbComment[ herbCommentID=" + herbCommentID + " ]";
    }
    
}
