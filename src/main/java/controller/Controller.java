package controller;

import com.google.gson.Gson;
import dto.PredResDTO;
import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import model.PrediccionBody;
import model.PrediccionInputData;
//import service.DemoPost;
import service.Service;

@Named(value = "controllerDiabetes")
@SessionScoped
public class Controller implements Serializable {

    private PrediccionInputData data;
    private Service service;

    public Controller() {
        data = new PrediccionInputData();
        service = new Service();
    }

    public void predecir() throws IOException {
        try {
            PrediccionBody model = new PrediccionBody();
            model.setModel("model/5f52ac1b0d052e40ea0002b6");
            PrediccionInputData data = new PrediccionInputData();
            model.setInput_data(data);
            String response = service.post(model);
            Gson gson = new Gson();
            PredResDTO predResDTO = gson.fromJson(response, PredResDTO.class);
            
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Predicción ", "Usted "+ predResDTO.getOutput() + " tiene Diabetes"));
            this.clear();
        } catch (Exception e) {
            System.out.println("Error Controller");
        }
    }
    
    public void clear(){
        data.setEmbarazos(0.0);
        
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public PrediccionInputData getData() {
        return data;
    }

    public void setData(PrediccionInputData data) {
        this.data = data;
    }
}
