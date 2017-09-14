package chengxiang9004.com.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chengxiang on 2017/9/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
