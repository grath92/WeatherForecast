package com.gopalkrath.weatherforecast.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gopalkrath.weatherforecast.R;
import com.gopalkrath.weatherforecast.Utility;
import com.gopalkrath.weatherforecast.models.Forecast;

import java.util.List;

public class ForecastViewAdapter extends RecyclerView.Adapter<ForecastViewAdapter.MyViewHolder>{

    private List<Forecast> mForecasts;

    public ForecastViewAdapter(List<Forecast> mForecasts) {
        this.mForecasts = mForecasts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_forecast,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Forecast forecast = mForecasts.get(position);
        String sDayDate = forecast.getmDay()+", "+ forecast.getmDate();
        String sMaxTemp = "Max: " + Utility.convertTempFtoC(forecast.getmHighTemp());
        String sMinTemp = "Min: " + Utility.convertTempFtoC(forecast.getmLowTemp());
        String sCondition = forecast.getmText();

        holder.txtDayDate.setText(sDayDate);
        holder.txtMaxTemp.setText(sMaxTemp);
        holder.txtMinTemp.setText(sMinTemp);
        holder.txtWeatherCondition.setText(sCondition);
        switch (sCondition) {
            case Utility.STR_PARTLY_CLOUDY:
            case Utility.STR_MOSTLY_CLOUDY:
                holder.imgCloud.setImageResource(R.drawable.ic_partly_cloudy);
                break;
            case Utility.STR_MOSTLY_SUNNY:
            case Utility.STR_SUNNY:
                holder.imgCloud.setImageResource(R.drawable.ic_sunny);
                break;
            case Utility.STR_CLOUDY:
                holder.imgCloud.setImageResource(R.drawable.ic_cloudy);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mForecasts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtDayDate, txtMaxTemp, txtMinTemp, txtWeatherCondition;
        public ImageView imgCloud;

        public MyViewHolder(View view) {
            super(view);
            txtDayDate = (TextView) view.findViewById(R.id.txtDayDate);
            txtMaxTemp = (TextView) view.findViewById(R.id.txtMaxTemp);
            txtMinTemp = (TextView) view.findViewById(R.id.txtMinTemp);
            imgCloud = (ImageView) view.findViewById(R.id.imgCloud);
            txtWeatherCondition = (TextView) view.findViewById(R.id.txtWeatherCondition);
        }
    }
}
