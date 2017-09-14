package chengxiang9004.com.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chengxiang on 2017/9/13.
 */

public class Suggestion {
    @SerializedName("air")
    public Air air;
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("drsg")
    public Drsg drsg;
    @SerializedName("flu")
    public Flu flu;
    @SerializedName("sport")
    public Sport sport;
    @SerializedName("trav")
    public Trav trav;
    @SerializedName("uv")
    public Uv uv;
    public class Air{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Comfort{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Drsg{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Flu{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Trav{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }
    public class Uv{
        @SerializedName("brf")
        public String brf;
        @SerializedName("txt")
        public String info;
    }

}
