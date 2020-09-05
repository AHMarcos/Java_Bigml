package service;

import com.google.gson.Gson;
import java.io.IOException;
import model.PrediccionBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Service {
    
    private String ENDPOINT = "https://bigml.io/andromeda/prediction?username=marcosalarcon;api_key=7081e0eeee307b313644781c3e6859290fe11479";

    public final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    public String post(PrediccionBody prediccionBody) throws IOException {

        Gson gson = new Gson();
        RequestBody body = RequestBody.create(gson.toJson(prediccionBody), JSON);
        Request request = new Request.Builder()
                .url(ENDPOINT)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
