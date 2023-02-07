package org.example;

import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class APItest {
    private JsonPlacerholderAPI jsonPlacerholderAPI = JsonPlacerholderAPI.getInstance();

    @Test
    public void testApiUser() throws IOException{
        var users = jsonPlacerholderAPI.getUsers().execute().body();

        assertNotNull(users);
        assertEquals(100, users.size());
    }
}
