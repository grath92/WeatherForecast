package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class Astronomy {

    @SerializedName("sunrise")
    public String mSunrise;

    @SerializedName("sunset")
    public String mSunset;
}
