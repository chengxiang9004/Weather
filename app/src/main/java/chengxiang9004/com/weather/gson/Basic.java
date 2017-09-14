package chengxiang9004.com.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chengxiang on 2017/9/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("cnty")
    public String china;
    @SerializedName("id")
    public String weatherId;
    @SerializedName("lat")
    public String lat;
    @SerializedName("lon")
    public String lon;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
        @SerializedName("utc")
        public String utc;
    }
}
