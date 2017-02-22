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
import org.json.*;
import java.io.FileWriter;
import java.io.IOException;

public class AdminAction extends ActionSupport implements ModelDriven {
    Admin admin = new Admin();
    JSONArray station,show;
    
    public Object getModel() {
        return admin;
    }
    public String execute() throws Exception {
        String text = "";
        JSONObject obj = new JSONObject();
        JSONArray list = new JSONArray();
        station = obj.getJSONArray("usernameAd");
        
        for(int i = 0; i < station.length(); i++){
            JSONObject jsonObject = station.getJSONObject(i);
            show = jsonObject.getJSONArray(admin.getUsernameAd());
            obj.putOnce(admin.getUsernameAd(), admin.getPasswordAd());
        
        return SUCCESS;
    }
        return null;
}}
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

