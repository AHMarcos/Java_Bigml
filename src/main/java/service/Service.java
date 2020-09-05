/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import javax.json.JsonException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

import model.Model;

/**
 *
 * @author marco
 */
public class Service {

    public JSONObject obtenerData(Model model) throws IOException, JsonException {
        System.out.println("pase por aqui");

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n    \"model\": \"model/5f52ac1b0d052e40ea0002b6\",\r\n    \"input_data\": {\r\n        \"embarazos\": 8.0,\r\n        \"glucosa\": 63.0,\r\n        \"presion_sanguinea\": 69.0,\r\n        \"pliegue_cutaneo\": 50.0,\r\n        \"insulina\": 91.0,\r\n        \"indice_de_masa_corporal\": 168.0,\r\n        \"pedigri_diabetes\": 429.0,\r\n        \"edad\": 50.0,\r\n        \"f_de_diagnostico_month\": \"3\",\r\n        \"f_diagnostico_day_of_month\": 22.0,\r\n        \"f_diagnóstico_day_of_week\": \"1\"\r\n    }\r\n}");
        Request request = new Request.Builder()
                .url("https://bigml.io/andromeda/prediction?username=marcosalarcon;api_key=7081e0eeee307b313644781c3e6859290fe11479")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);

        }
        Gson gson = new Gson();
        JSONObject jsonObject = new JSONObject(response.body().string());
        JSONObject xd = jsonObject.getJSONObject("Results")
                .getJSONArray("Predicción ")
                .getJSONObject(0);

        return xd;
    }

}
