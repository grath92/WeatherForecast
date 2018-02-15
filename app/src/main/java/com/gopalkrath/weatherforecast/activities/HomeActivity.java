package com.gopalkrath.weatherforecast.activities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gopalkrath.weatherforecast.R;
import com.gopalkrath.weatherforecast.Utility;
import com.gopalkrath.weatherforecast.adapters.ForecastViewAdapter;
import com.gopalkrath.weatherforecast.models.Forecast;
import com.gopalkrath.weatherforecast.models.QueryModel;
import com.gopalkrath.weatherforecast.models.QueryResponse;
import com.gopalkrath.weatherforecast.networking.ApiClient;
import com.gopalkrath.weatherforecast.networking.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = HomeActivity.class.getSimpleName();

    private ApiInterface apiService;

    private ProgressBar progressBar;

    private TextView txtCityName, txtSunrise, txtSunset, txtTemp, txtWeatherCondition,
            txtSlide, txtRetry;
    private ImageView imgCloud;
    private RelativeLayout layoutMain;

    private List<Forecast> mForecasts;

    private RecyclerView rcvSlide;
    private ForecastViewAdapter forecastViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        apiService = ApiClient.getClient().create(ApiInterface.class);

        initializeViews();

        apiCall();
    }

    private void initializeViews() {
        mForecasts = new ArrayList<>();
        layoutMain = (RelativeLayout) findViewById(R.id.layoutMain);
        txtSunrise = (TextView) findViewById(R.id.txtSunrise);
        txtSunset = (TextView) findViewById(R.id.txtSunset);
        txtCityName = (TextView) findViewById(R.id.txtCityName);
        txtTemp = (TextView) findViewById(R.id.txtTemp);
        txtWeatherCondition = (TextView) findViewById(R.id.txtWeatherCondition);
        txtSlide = (TextView) findViewById(R.id.txtSlide);
        txtRetry = (TextView) findViewById(R.id.txtRetry);
        imgCloud = (ImageView) findViewById(R.id.imgCloud);
        rcvSlide = (RecyclerView) findViewById(R.id.rcvSlide);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rcvSlide.setLayoutManager(layoutManager);
        forecastViewAdapter = new ForecastViewAdapter(mForecasts);
        rcvSlide.setAdapter(forecastViewAdapter);

        txtRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiCall();
            }
        });

    }

    private void apiCall() {

        showProgressBar();

        Call<QueryResponse> call = apiService.getWeatherForecast();
        call.enqueue(new Callback<QueryResponse>() {
            @Override
            public void onResponse(Call<QueryResponse> call, Response<QueryResponse> response) {
                txtRetry.setVisibility(View.GONE);
                QueryModel queryModel = response.body().getmQuery();

                bindDataWithView(queryModel);

            }

            @Override
            public void onFailure(Call<QueryResponse> call, Throwable t) {
                // Log error here since request failed
                txtRetry.setVisibility(View.VISIBLE);
                hideProgressBar();
                Log.e(TAG, t.toString());
                Utility.showMessage(layoutMain, t.toString());

            }
        });

    }

    private void bindDataWithView(QueryModel queryModel) {
        String cityName = queryModel.getmResults().getmChannels().getmCityLocation().getmCity();
        String temp = Utility.convertTempFtoC(queryModel.getmResults()
                .getmChannels().getmItem().getmCurrentCondition().getmTemp());
        String wethrCondition = queryModel.getmResults()
                .getmChannels().getmItem().getmCurrentCondition().getmText();
        String sunrise = "Sunrise: " + queryModel.getmResults()
                .getmChannels().getmAstronomy().getmSunrise();
        String sunset = "Sunset: " + queryModel.getmResults()
                .getmChannels().getmAstronomy().getmSunset();

        mForecasts.addAll(queryModel.getmResults().getmChannels().getmItem().getmForecasts());
        forecastViewAdapter.notifyDataSetChanged();
        String slideTo = "Slide to see " + mForecasts.size() + " Days Forecast";

        txtCityName.setText(cityName);
        txtSunrise.setText(sunrise);
        txtSunset.setText(sunset);
        txtTemp.setText(temp);
        txtWeatherCondition.setText(wethrCondition);
        txtSlide.setText(slideTo);

        switch (wethrCondition) {
            case Utility.STR_PARTLY_CLOUDY:
            case Utility.STR_MOSTLY_CLOUDY:
                imgCloud.setImageResource(R.drawable.ic_partly_cloudy);
                break;
            case Utility.STR_MOSTLY_SUNNY:
            case Utility.STR_SUNNY:
                imgCloud.setImageResource(R.drawable.ic_sunny);
                break;
            case Utility.STR_CLOUDY:
                imgCloud.setImageResource(R.drawable.ic_cloudy);
                break;
        }

        hideProgressBar();
    }


    private void showProgressBar() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

}
