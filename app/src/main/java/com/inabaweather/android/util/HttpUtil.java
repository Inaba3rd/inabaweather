package com.inabaweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Inaba3rd on 2017/12/18.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
