/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass;

import java.io.IOException;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.struts2.json.annotations.JSON;
import java.io.InputStream;
import java.net.URL;
import net.sf.json.JSONObject;

import net.sf.json.xml.XMLSerializer;
import org.apache.commons.io.IOUtils;



/**
 *
 * @author iamGG
 */

@Entity
@Table(name = "Admin", catalog = "SocialHerb_db", schema = "dbo")
@JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )

//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findByUsernameAd", query = "SELECT a FROM Admin a WHERE a.usernameAd = :usernameAd")
    , @NamedQuery(name = "Admin.findByPasswordAd", query = "SELECT a FROM Admin a WHERE a.passwordAd = :passwordAd")})





 
public class Admin implements Serializable {
    
 
    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usernameAd")
    @Id
    private String usernameAd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "passwordAd")
    private String passwordAd;

   
    public Admin() {
        
    }

    public Admin(String usernameAd) {
        this.usernameAd = usernameAd;
    }

    public Admin(String usernameAd, String passwordAd) {
        this.usernameAd = usernameAd;
        this.passwordAd = passwordAd;
    }

    public String getUsernameAd() {
        return usernameAd;
    }

    public void setUsernameAd(String usernameAd) {
        this.usernameAd = usernameAd;
    }

    public String getPasswordAd() {
        return passwordAd;
    }

    public void setPasswordAd(String passwordAd) {
        this.passwordAd = passwordAd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usernameAd != null ? usernameAd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.usernameAd == null && other.usernameAd != null) || (this.usernameAd != null && !this.usernameAd.equals(other.usernameAd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.EntityClass.Admin[ usernameAd=" + usernameAd + " ]";
    }
   
       
//         public static int PRETTY_PRINT_INDENT_FACTOR = 4;
//    public static String  URL =
//        "http://localhost:8080/HerbServices/webresources/service.entityclass.admin";
//
//    public static void main(String[] args) {
//        
//        try {
//            JSONObject xmlJSONObj = XML.toJSONObject(URL);
//            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
//            System.out.println(xmlJSONObj);
//        } catch (JSONException je) {
//            System.out.println(je.toString());
//        }
//    }
    
//  public static void main(String[] args) {
//URL url = null;
// InputStream inputStream = null;   
// 
//        try {
//           url = Admin.class.getClassLoader().getResource("http://localhost:8080/HerbServices/webresources/service.entityclass.admin");
//            inputStream = url.openStream();
//            String xml = IOUtils.toString(inputStream);
//            JSONObject objJson = XMLSerializer.readObject(xml);
//            System.out.println("JSON data : " + objJson);
//      } catch (IOException e) {
//        }finally{
//     try {
//                if (inputStream != null) {
//                    inputStream.close();
//                }
//                url = null;
//            } catch (IOException ex) {}
//        }
//        
//        
//               new Admin();
//        
//    }             
      
    }

   
       
