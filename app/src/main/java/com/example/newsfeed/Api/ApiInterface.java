package com.example.newsfeed.Api;

import com.example.newsfeed.modules.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("top-headlines")
    Call<News> getnews(
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );
}
