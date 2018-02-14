package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;


public class CityLocation {

    @SerializedName("city")
    public String mCity;

    @SerializedName("country")
    public String mCountry;

    @SerializedName("region")
    public String mRegion;

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public String getmRegion() {
        return mRegion;
    }

    public void setmRegion(String mRegion) {
        this.mRegion = mRegion;
    }
}
