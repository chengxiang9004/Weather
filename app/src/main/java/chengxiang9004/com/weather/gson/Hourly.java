package chengxiang9004.com.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chengxiang on 2017/9/14.
 */

public class Hourly {
    @SerializedName("cond")
    public Cond cond;
    @SerializedName("date")
    public String date;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pop")
    public String pop;
    @SerializedName("pres")
    public String pres;
    @SerializedName("tmp")
    public String tmp;
    @SerializedName("wind")
    public Forecast.Wind wind;
    public class Cond{
        @SerializedName("code")
        public String code;
        @SerializedName("txt")
        public String txt;
    }
}
