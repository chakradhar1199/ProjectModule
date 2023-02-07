package org.example;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

import java.util.List;

public interface JsonPlacerholderAPI {

    @GET("posts")
    Call<List<Post>> getUsers();

    static JsonPlacerholderAPI getInstance(){
        return new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(JsonPlacerholderAPI.class);
    }
}
