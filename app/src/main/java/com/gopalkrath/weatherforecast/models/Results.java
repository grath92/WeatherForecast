package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("channel")
    public Channels mChannels;

    public Channels getmChannels() {
        return mChannels;
    }

    public void setmChannels(Channels mChannels) {
        this.mChannels = mChannels;
    }
}
