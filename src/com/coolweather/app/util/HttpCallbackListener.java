package com.coolweather.app.util;

/**
 * Created by Administrator on 2014/12/3.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
