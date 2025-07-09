package com.nrmyw.hud_data.app;

import android.app.Application;

import com.newbee.ble_lib.BleManager;


public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BleManager.getInstance().init(this);

    }
}
