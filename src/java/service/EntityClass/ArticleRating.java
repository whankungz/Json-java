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
@Table(name = "ArticleRating", catalog = "SocialHerb_db", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ArticleRating.findAll", query = "SELECT a FROM ArticleRating a")
    , @NamedQuery(name = "ArticleRating.findByArticleRatID", query = "SELECT a FROM ArticleRating a WHERE a.articleRatID = :articleRatID")
    , @NamedQuery(name = "ArticleRating.findByRatingArt", query = "SELECT a FROM ArticleRating a WHERE a.ratingArt = :ratingArt")
    , @NamedQuery(name = "ArticleRating.findByUsernameArt", query = "SELECT a FROM ArticleRating a WHERE a.usernameArt = :usernameArt")})
public class ArticleRating implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "articleRatID")
    @Id
    private String articleRatID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ratingArt")
    private double ratingArt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usernameArt")
    private String usernameArt;
    @JoinColumn(name = "articleID", referencedColumnName = "articleID")
    @ManyToOne(optional = false)
    private Article articleID;

    public ArticleRating() {
    }

    public ArticleRating(String articleRatID) {
        this.articleRatID = articleRatID;
    }

    public ArticleRating(String articleRatID, double ratingArt, String usernameArt) {
        this.articleRatID = articleRatID;
        this.ratingArt = ratingArt;
        this.usernameArt = usernameArt;
    }

    public String getArticleRatID() {
        return articleRatID;
    }

    public void setArticleRatID(String articleRatID) {
        this.articleRatID = articleRatID;
    }

    public double getRatingArt() {
        return ratingArt;
    }

    public void setRatingArt(double ratingArt) {
        this.ratingArt = ratingArt;
    }

    public String getUsernameArt() {
        return usernameArt;
    }

    public void setUsernameArt(String usernameArt) {
        this.usernameArt = usernameArt;
    }

    public Article getArticleID() {
        return articleID;
    }

    public void setArticleID(Article articleID) {
        this.articleID = articleID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (articleRatID != null ? articleRatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArticleRating)) {
            return false;
        }
        ArticleRating other = (ArticleRating) object;
        if ((this.articleRatID == null && other.articleRatID != null) || (this.articleRatID != null && !this.articleRatID.equals(other.articleRatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.ArticleRating[ articleRatID=" + articleRatID + " ]";
    }
    
}
