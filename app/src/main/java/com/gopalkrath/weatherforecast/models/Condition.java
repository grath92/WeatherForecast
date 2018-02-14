package com.gopalkrath.weatherforecast.models;


import com.google.gson.annotations.SerializedName;

public class Condition {

    @SerializedName("date")
    public String mDate;

    @SerializedName("temp")
    public String mTemp;

    @SerializedName("text")
    public String mText;

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTemp() {
        return mTemp;
    }

    public void setmTemp(String mTemp) {
        this.mTemp = mTemp;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }
}
