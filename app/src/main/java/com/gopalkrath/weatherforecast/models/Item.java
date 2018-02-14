package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("condition")
    public Condition mCurrentCondition;

    @SerializedName("forecast")
    public List<Forecast> mForecasts;

    public Condition getmCurrentCondition() {
        return mCurrentCondition;
    }

    public void setmCurrentCondition(Condition mCurrentCondition) {
        this.mCurrentCondition = mCurrentCondition;
    }

    public List<Forecast> getmForecasts() {
        return mForecasts;
    }

    public void setmForecasts(List<Forecast> mForecasts) {
        this.mForecasts = mForecasts;
    }
}
