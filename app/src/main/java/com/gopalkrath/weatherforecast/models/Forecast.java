package com.gopalkrath.weatherforecast.models;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Forecast implements Parcelable{

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

    // Constructor
    public Forecast(String date, String day, String high, String low, String txt){
        this.mDate = date;
        this.mDay = day;
        this.mHighTemp = high;
        this.mLowTemp = low;
        this.mText = txt;
    }

    protected Forecast(Parcel in) {
        mCode = in.readString();
        mDate = in.readString();
        mDay = in.readString();
        mHighTemp = in.readString();
        mLowTemp = in.readString();
        mText = in.readString();
    }

    public static final Creator<Forecast> CREATOR = new Creator<Forecast>() {
        @Override
        public Forecast createFromParcel(Parcel in) {
            return new Forecast(in);
        }

        @Override
        public Forecast[] newArray(int size) {
            return new Forecast[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDay);
        parcel.writeString(this.mDate);
        parcel.writeString(this.mHighTemp);
        parcel.writeString(this.mLowTemp);
        parcel.writeString(this.mText);
    }

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
