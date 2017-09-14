package chengxiang9004.com.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chengxiang on 2017/9/13.
 */

public class Now {
    @SerializedName("cond")
    public Hourly.Cond cond;
    @SerializedName("fi")
    public String fi;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pcpn")
    public String pcpn;
    @SerializedName("pres")
    public String pres;
    @SerializedName("tmp")
    public String tmp;
    @SerializedName("vis")
    public String vis;
    @SerializedName("wind")
    public Forecast.Wind wind;
}
