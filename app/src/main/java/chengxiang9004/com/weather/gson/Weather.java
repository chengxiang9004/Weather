package chengxiang9004.com.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chengxiang on 2017/9/13.
 */

public class Weather {
    public Basic basic;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
    @SerializedName("hourly_forecast")
    public List<Hourly>hourlyList;
    public Now now;
    public String status;
    public Suggestion suggestion;
}