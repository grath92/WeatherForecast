package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("code")
    public String mCode;

    @SerializedName("date")
    public String mDate;

    @SerializedName("day")
    public String mDay;

    @SerializedName("high")
    public String mHighTemp;

    @SerializedName("low")
    public String mLowTemp;

    @SerializedName("text")
    public String mText;
}
