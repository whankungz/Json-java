/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.EntityClass.action;

import service.EntityClass.HealthFood;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class HealthFoodAction extends ActionSupport implements ModelDriven {
    HealthFood food = new HealthFood();
    
    public String execute() throws Exception{
        return SUCCESS;
    }
    public Object getModel(){
        return food;
    }
}
