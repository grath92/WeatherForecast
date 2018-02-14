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

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmDay() {
        return mDay;
    }

    public void setmDay(String mDay) {
        this.mDay = mDay;
    }

    public String getmHighTemp() {
        return mHighTemp;
    }

    public void setmHighTemp(String mHighTemp) {
        this.mHighTemp = mHighTemp;
    }

    public String getmLowTemp() {
        return mLowTemp;
    }

    public void setmLowTemp(String mLowTemp) {
        this.mLowTemp = mLowTemp;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
