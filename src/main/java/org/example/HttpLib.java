package org.example;

import okhttp3.OkHttpClient;
import okhttp3.*;
public class HttpLib {
    OkHttpClient client;

    public HttpLib() {
        client = new OkHttpClient();
    }

    public String getApiResponse(){
        var request = new Request.Builder().url("https://dummy.restapiexample.com/api/v1/employees").build();
        try (var response = client.newCall(request).execute()) {
            return response.body().string();
        } catch (Exception e) {
            return e.getMessage();
        }

    }
}
