/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Model;
import org.primefaces.json.JSONObject;
import service.Service;

/**
 *
 * @author marco
 */

@Named(value = "controllerDiabetes")
@SessionScoped
public class Controller implements Serializable{
    
    private Model model;
    private Service service;
    
    public Controller() {        
        model = new Model();
        service = new Service();
    }
    
    public void obtener() throws Exception{
//        try{
//            JSONObject probability = service.obtenerData(model);
//            String diabetes = probability.getString("");
//            System.out.println(probability);
//        }
        
    }
    
    
}


