/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass.action;

import service.EntityClass.Herb;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class HerbAction extends ActionSupport implements ModelDriven {
    Herb herb = new Herb();
    
    public String execute() throws Exception{
        return SUCCESS;
    }
    public Object getModel(){
        return herb;
    }
}
