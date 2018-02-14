package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;


public class CityLocation {

    @SerializedName("city")
    public String mCity;

    @SerializedName("country")
    public String mCountry;

    @SerializedName("region")
    public String mRegion;

}
