package com.example.webservicee2.remote;

import com.example.webservicee2.model.get.GetResponse;
import com.example.webservicee2.model.post.PostResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @FormUrlEncoded
    @POST("/items")
    Call<PostResponse> createItems(@Field("name") String name,
                                   @Field("description") String description);
    @GET("/items")
    Call<GetResponse> getAllItems();
    @FormUrlEncoded
    @PUT("/items/{id}")
    Call<JsonObject> updateDataItems(@Path("id") String id,
                                     @Field("name") String name,
                                     @Field("description") String description);
    @DELETE("/items/{id}")
    Call<JsonObject> deleteDataItems(@Path("id") String id);
}
