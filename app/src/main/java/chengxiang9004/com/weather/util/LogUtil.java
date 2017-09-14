package chengxiang9004.com.weather.util;

import android.util.Log;

/**
 * Created by chengxiang on 2017/9/14.
 */

public class LogUtil {
    private static final int DEBUG_LEVEL=5;
    public static void e(String tag,String msg){
        if (DEBUG_LEVEL>=1){
            Log.e(tag,msg);
        }
    }
    public static void w(String tag,String msg){
        if (DEBUG_LEVEL>=2){
            Log.e(tag,msg);
        }
    }
    public static void d(String tag,String msg){
        if (DEBUG_LEVEL>=3){
            Log.e(tag,msg);
        }
    }
    public static void i(String tag,String msg){
        if (DEBUG_LEVEL>=4){
            Log.e(tag,msg);
        }
    }
    public static void v(String tag,String msg){
        if (DEBUG_LEVEL>=5){
            Log.e(tag,msg);
        }
    }
}
