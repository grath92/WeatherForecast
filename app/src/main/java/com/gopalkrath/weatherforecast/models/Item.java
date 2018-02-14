package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("forecast")
    public List<Forecast> mForecasts;
}
