package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class QueryModel {

    @SerializedName("results")
    public Results mResults;

    public Results getmResults() {
        return mResults;
    }

    public void setmResults(Results mResults) {
        this.mResults = mResults;
    }
}
