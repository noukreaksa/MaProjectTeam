package com.example.maproject.API.Service;

import com.example.maproject.API.model.Province;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiServiceProvince {

    @GET("/provinces.json")
    Call<List<Province>> loadProvinceList();
}
