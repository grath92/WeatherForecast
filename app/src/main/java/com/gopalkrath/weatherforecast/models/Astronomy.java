package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class Astronomy {

    @SerializedName("sunrise")
    public String mSunrise;

    @SerializedName("sunset")
    public String mSunset;

    public String getmSunrise() {
        return mSunrise;
    }

    public void setmSunrise(String mSunrise) {
        this.mSunrise = mSunrise;
    }

    public String getmSunset() {
        return mSunset;
    }

    public void setmSunset(String mSunset) {
        this.mSunset = mSunset;
    }
}
