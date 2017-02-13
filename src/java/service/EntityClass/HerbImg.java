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
import javax.persistence.Lob;
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
@Table(name = "HerbImg", catalog = "SocialHerb_db", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HerbImg.findAll", query = "SELECT h FROM HerbImg h")
    , @NamedQuery(name = "HerbImg.findByHerbImgID", query = "SELECT h FROM HerbImg h WHERE h.herbImgID = :herbImgID")})
public class HerbImg implements Serializable {

    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "herbImgID")
    @Id
    private String herbImgID;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "leaf")
    private String leaf;
    @Lob
    @Column(name = "leafImg")
    private byte[] leafImg;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "branch")
    private String branch;
    @Lob
    @Column(name = "branchImg")
    private byte[] branchImg;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "trunk")
    private String trunk;
    @Lob
    @Column(name = "trunkImg")
    private byte[] trunkImg;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "root")
    private String root;
    @Lob
    @Column(name = "rootImg")
    private byte[] rootImg;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "flower")
    private String flower;
    @Lob
    @Column(name = "flowerImg")
    private byte[] flowerImg;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "fruit")
    private String fruit;
    @Lob
    @Column(name = "fruitImg")
    private byte[] fruitImg;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "seed")
    private String seed;
    @Lob
    @Column(name = "seedImg")
    private byte[] seedImg;
    @JoinColumn(name = "herbID", referencedColumnName = "herbID")
    @ManyToOne(optional = false)
    private Herb herbID;

    public HerbImg() {
    }

    public HerbImg(String herbImgID) {
        this.herbImgID = herbImgID;
    }

    public String getHerbImgID() {
        return herbImgID;
    }

    public void setHerbImgID(String herbImgID) {
        this.herbImgID = herbImgID;
    }

    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public byte[] getLeafImg() {
        return leafImg;
    }

    public void setLeafImg(byte[] leafImg) {
        this.leafImg = leafImg;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public byte[] getBranchImg() {
        return branchImg;
    }

    public void setBranchImg(byte[] branchImg) {
        this.branchImg = branchImg;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public byte[] getTrunkImg() {
        return trunkImg;
    }

    public void setTrunkImg(byte[] trunkImg) {
        this.trunkImg = trunkImg;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public byte[] getRootImg() {
        return rootImg;
    }

    public void setRootImg(byte[] rootImg) {
        this.rootImg = rootImg;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public byte[] getFlowerImg() {
        return flowerImg;
    }

    public void setFlowerImg(byte[] flowerImg) {
        this.flowerImg = flowerImg;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public byte[] getFruitImg() {
        return fruitImg;
    }

    public void setFruitImg(byte[] fruitImg) {
        this.fruitImg = fruitImg;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public byte[] getSeedImg() {
        return seedImg;
    }

    public void setSeedImg(byte[] seedImg) {
        this.seedImg = seedImg;
    }

    public Herb getHerbID() {
        return herbID;
    }

    public void setHerbID(Herb herbID) {
        this.herbID = herbID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (herbImgID != null ? herbImgID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HerbImg)) {
            return false;
        }
        HerbImg other = (HerbImg) object;
        if ((this.herbImgID == null && other.herbImgID != null) || (this.herbImgID != null && !this.herbImgID.equals(other.herbImgID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.HerbImg[ herbImgID=" + herbImgID + " ]";
    }
    
}
