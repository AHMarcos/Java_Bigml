
package dto;

import java.io.Serializable;
import java.util.List;

public class PredResDTO implements Serializable{
    private String creator;
    private String dataset;
    private String model;
    private String name;
    private String objective_field_name;
    private String output;
    private List<Object> probabilities;
    private Double probability;
    private String resource;
    private String task;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjective_field_name() {
        return objective_field_name;
    }

    public void setObjective_field_name(String objective_field_name) {
        this.objective_field_name = objective_field_name;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public List<Object> getProbabilities() {
        return probabilities;
    }

    public void setProbabilities(List<Object> probabilities) {
        this.probabilities = probabilities;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "PredResDTO{" +
                "creator='" + creator + '\'' +
                ", dataset='" + dataset + '\'' +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", objective_field_name='" + objective_field_name + '\'' +
                ", output='" + output + '\'' +
                ", probabilities=" + probabilities +
                ", probability=" + probability +
                ", resource='" + resource + '\'' +
                ", task='" + task + '\'' +
                '}';
    }
    
}
