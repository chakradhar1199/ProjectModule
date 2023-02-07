package org.example;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        var httpLib = new HttpLib();
//        System.out.println(httpLib.getApiResponse());

        JsonPlacerholderAPI jsonPlacerholderAPI = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(JsonPlacerholderAPI.class);
        try {
            for (Post post : jsonPlacerholderAPI.getUsers().execute().body()){
                System.out.println("Title "+post.getTitle());
            }
        }
        catch (IOException e){
            System.out.print("Exception occured "+e);
        }
    }
}