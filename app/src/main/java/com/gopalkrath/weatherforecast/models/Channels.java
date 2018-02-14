package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class Channels {

    @SerializedName("location")
    public CityLocation mCityLocation;

    @SerializedName("astronomy")
    public Astronomy mAstronomy;

    @SerializedName("item")
    public Item mItem;
}
