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
@Table(name = "HealthFood", catalog = "SocialHerb_db", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HealthFood.findAll", query = "SELECT h FROM HealthFood h")
    , @NamedQuery(name = "HealthFood.findByFoodID", query = "SELECT h FROM HealthFood h WHERE h.foodID = :foodID")
    , @NamedQuery(name = "HealthFood.findByDateFood", query = "SELECT h FROM HealthFood h WHERE h.dateFood = :dateFood")})
public class HealthFood implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "foodID")
    @Id
    private String foodID;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "foodName")
    private String foodName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "foodImg")
    private byte[] foodImg;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "foodRecipe")
    private String foodRecipe;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "foodHowto")
    private String foodHowto;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "creditFood")
    private String creditFood;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateFood")
    @Temporal(TemporalType.DATE)
    private Date dateFood;

    public HealthFood() {
    }

    public HealthFood(String foodID) {
        this.foodID = foodID;
    }

    public HealthFood(String foodID, String foodName, byte[] foodImg, String foodRecipe, String foodHowto, String creditFood, Date dateFood) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodImg = foodImg;
        this.foodRecipe = foodRecipe;
        this.foodHowto = foodHowto;
        this.creditFood = creditFood;
        this.dateFood = dateFood;
    }

    public String getFoodID() {
        return foodID;
    }

    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public byte[] getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(byte[] foodImg) {
        this.foodImg = foodImg;
    }

    public String getFoodRecipe() {
        return foodRecipe;
    }

    public void setFoodRecipe(String foodRecipe) {
        this.foodRecipe = foodRecipe;
    }

    public String getFoodHowto() {
        return foodHowto;
    }

    public void setFoodHowto(String foodHowto) {
        this.foodHowto = foodHowto;
    }

    public String getCreditFood() {
        return creditFood;
    }

    public void setCreditFood(String creditFood) {
        this.creditFood = creditFood;
    }

    public Date getDateFood() {
        return dateFood;
    }

    public void setDateFood(Date dateFood) {
        this.dateFood = dateFood;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodID != null ? foodID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HealthFood)) {
            return false;
        }
        HealthFood other = (HealthFood) object;
        if ((this.foodID == null && other.foodID != null) || (this.foodID != null && !this.foodID.equals(other.foodID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.HealthFood[ foodID=" + foodID + " ]";
    }
    
}
