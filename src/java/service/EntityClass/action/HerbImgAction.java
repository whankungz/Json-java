/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass.action;

import service.EntityClass.HerbImg;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class HerbImgAction extends ActionSupport implements ModelDriven {
    HerbImg herbImg = new HerbImg();
    
    public String execute() throws Exception{
        return SUCCESS;
    }
    public Object getModel(){
        return herbImg;
    }
}
