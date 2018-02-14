package com.gopalkrath.weatherforecast.models;

import com.google.gson.annotations.SerializedName;

public class QueryResponse {

    @SerializedName("query")
    public QueryModel mQuery;

    public QueryModel getmQuery() {
        return mQuery;
    }

    public void setmQuery(QueryModel mQuery) {
        this.mQuery = mQuery;
    }
}
