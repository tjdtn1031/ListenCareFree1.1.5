package com.example.listencarefree;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Django_Api {

    @GET("emotion/{emotion}/")
    Call<Django_Item> getPosts(@Path("emotion") String post);

}

