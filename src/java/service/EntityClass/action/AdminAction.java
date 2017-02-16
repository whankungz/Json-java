/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass.action;

import service.EntityClass.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Action;
import java.net.*;
import org.json.*;

public class AdminAction extends ActionSupport implements ModelDriven {
    Admin admin = new Admin();
    
    JSONArray station;
    public String execute() throws Exception {
        String text = "";
        //URL url;
        /*try{
        //http://localhost:8080/HerbServices/webresources/service.entityclass.admin 
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }*/
        
        JSONObject obj = new JSONObject(text);
        station = obj.getJSONArray("usernameAd");
        
        for(int i = 0; i < station.length(); i++){
            JSONObject jsonObject = station.getJSONObject(i);
            
        }
        return SUCCESS;
    }
    public Object getModel() {
        return admin;
    }
}
    /*private String[] stringarray;
    private int[] numberarray;
    private List<String> lists = new ArrayList<String>();*/
    /*private Map<String, String> maps = new HashMap<String, String>();
    
    public AdminAction() {
        maps.put("usernameAd", admin.getUsernameAd());
        maps.put("passwordAd", admin.getPasswordAd());
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }*/

