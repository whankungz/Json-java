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
@Table(name = "Article", catalog = "SocialHerb_db", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a")
    , @NamedQuery(name = "Article.findByArticleID", query = "SELECT a FROM Article a WHERE a.articleID = :articleID")
    , @NamedQuery(name = "Article.findByDateArt", query = "SELECT a FROM Article a WHERE a.dateArt = :dateArt")})
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "articleID")
    @Id
    private String articleID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "articleName")
    private String articleName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "articleImg")
    private byte[] articleImg;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "article")
    private String article;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateArt")
    @Temporal(TemporalType.DATE)
    private Date dateArt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articleID")
    private Collection<ArticleRating> articleRatingCollection;

    public Article() {
    }

    public Article(String articleID) {
        this.articleID = articleID;
    }

    public Article(String articleID, String articleName, byte[] articleImg, String article, Date dateArt) {
        this.articleID = articleID;
        this.articleName = articleName;
        this.articleImg = articleImg;
        this.article = article;
        this.dateArt = dateArt;
    }

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public byte[] getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(byte[] articleImg) {
        this.articleImg = articleImg;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Date getDateArt() {
        return dateArt;
    }

    public void setDateArt(Date dateArt) {
        this.dateArt = dateArt;
    }

    @XmlTransient
    public Collection<ArticleRating> getArticleRatingCollection() {
        return articleRatingCollection;
    }

    public void setArticleRatingCollection(Collection<ArticleRating> articleRatingCollection) {
        this.articleRatingCollection = articleRatingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (articleID != null ? articleID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.articleID == null && other.articleID != null) || (this.articleID != null && !this.articleID.equals(other.articleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.Article[ articleID=" + articleID + " ]";
    }
    
}
