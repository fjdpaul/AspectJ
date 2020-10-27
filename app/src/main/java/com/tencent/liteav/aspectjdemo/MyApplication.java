package com.tencent.liteav.aspectjdemo;

import android.app.Application;

import com.tencent.liteav.mylibrary.SensorsDataAPI;

/**
 * @Description: 类作用描述
 * @Author: shuidi
 * @CreateDate: 2020/10/26 下午5:13
 * @Version: 1.0
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SensorsDataAPI.init(this);
    }
}
