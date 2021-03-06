package com.example.dbkpandroidapp;

import com.example.dbkpandroidapp.Model.StatsModel;
import com.example.dbkpandroidapp.Model.UserModel;
import com.example.dbkpandroidapp.Model.UsersList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("admin/getUsers")
    Call<UsersList> getAllUsers(@Query("Login") String login, @Query("passwordHash") String passwordHash);

    @GET("admin/getId")
    Call<UserModel> getId(@Query("Login") String login, @Query("passwordHash") String passwordHash);

    @GET("admin/getStatistics")
    Call<StatsModel> getStatistics(@Query("Login") String login, @Query("passwordHash") String passwordHash);



//    @GET("admin/getUsers")
//    Call<Users>
}
