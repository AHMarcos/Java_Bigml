package model;

public class PrediccionInputData {

    private Double Embarazos;
    private Double Glucosa;
    private Double Presion_sanguinea;
    private Double Pliegue_cutaneo;
    private Double Insulina;
    private Double Indice_de_masa_corporal;
    private Double Pedigri_diabetes;
    private Double Edad;
    private String F_de_diagnostico_month;
    private Double F_diagnostico_day_of_month;
    private String F_diagnóstico_day_of_week;

    public Double getEmbarazos() {
        return Embarazos;
    }

    public void setEmbarazos(Double embarazos) {
        Embarazos = embarazos;
    }

    public Double getGlucosa() {
        return Glucosa;
    }

    public void setGlucosa(Double glucosa) {
        Glucosa = glucosa;
    }

    public Double getPresion_sanguinea() {
        return Presion_sanguinea;
    }

    public void setPresion_sanguinea(Double presion_sanguinea) {
        Presion_sanguinea = presion_sanguinea;
    }

    public Double getPliegue_cutaneo() {
        return Pliegue_cutaneo;
    }

    public void setPliegue_cutaneo(Double pliegue_cutaneo) {
        Pliegue_cutaneo = pliegue_cutaneo;
    }

    public Double getInsulina() {
        return Insulina;
    }

    public void setInsulina(Double insulina) {
        Insulina = insulina;
    }

    public Double getIndice_de_masa_corporal() {
        return Indice_de_masa_corporal;
    }

    public void setIndice_de_masa_corporal(Double indice_de_masa_corporal) {
        Indice_de_masa_corporal = indice_de_masa_corporal;
    }

    public Double getPedigri_diabetes() {
        return Pedigri_diabetes;
    }

    public void setPedigri_diabetes(Double pedigri_diabetes) {
        Pedigri_diabetes = pedigri_diabetes;
    }

    public Double getEdad() {
        return Edad;
    }

    public void setEdad(Double edad) {
        Edad = edad;
    }

    public String getF_de_diagnostico_month() {
        return F_de_diagnostico_month;
    }

    public void setF_de_diagnostico_month(String f_de_diagnostico_month) {
        F_de_diagnostico_month = f_de_diagnostico_month;
    }

    public Double getF_diagnostico_day_of_month() {
        return F_diagnostico_day_of_month;
    }

    public void setF_diagnostico_day_of_month(Double f_diagnostico_day_of_month) {
        F_diagnostico_day_of_month = f_diagnostico_day_of_month;
    }

    public String getF_diagnóstico_day_of_week() {
        return F_diagnóstico_day_of_week;
    }

    public void setF_diagnóstico_day_of_week(String f_diagnóstico_day_of_week) {
        F_diagnóstico_day_of_week = f_diagnóstico_day_of_week;
    }

    @Override
    public String toString() {
        return "PrediccionInputData{"
                + "Embarazos=" + Embarazos
                + ", Glucosa=" + Glucosa
                + ", Presion_sanguinea=" + Presion_sanguinea
                + ", Pliegue_cutaneo=" + Pliegue_cutaneo
                + ", Insulina=" + Insulina
                + ", Indice_de_masa_corporal=" + Indice_de_masa_corporal
                + ", Pedigri_diabetes=" + Pedigri_diabetes
                + ", Edad=" + Edad
                + ", F_de_diagnostico_month='" + F_de_diagnostico_month + '\''
                + ", F_diagnostico_day_of_month=" + F_diagnostico_day_of_month
                + ", F_diagnóstico_day_of_week='" + F_diagnóstico_day_of_week + '\''
                + '}';
    }

}
