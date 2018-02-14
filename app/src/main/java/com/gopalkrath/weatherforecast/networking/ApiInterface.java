package com.gopalkrath.weatherforecast.networking;

import com.gopalkrath.weatherforecast.models.QueryResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {

    @GET("yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D\"bangalore%2C%20in\")&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<QueryResponse> getWeatherForecast();

}