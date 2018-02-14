package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class Channels {

    @SerializedName("location")
    public CityLocation mCityLocation;

    @SerializedName("astronomy")
    public Astronomy mAstronomy;

    @SerializedName("item")
    public Item mItem;

    public CityLocation getmCityLocation() {
        return mCityLocation;
    }

    public void setmCityLocation(CityLocation mCityLocation) {
        this.mCityLocation = mCityLocation;
    }

    public Astronomy getmAstronomy() {
        return mAstronomy;
    }

    public void setmAstronomy(Astronomy mAstronomy) {
        this.mAstronomy = mAstronomy;
    }

    public Item getmItem() {
        return mItem;
    }

    public void setmItem(Item mItem) {
        this.mItem = mItem;
    }
}
