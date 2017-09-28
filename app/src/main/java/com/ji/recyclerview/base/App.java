package com.ji.recyclerview.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/9/28.
 */

public class App extends Application {
    public Context context;
    public App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public App getInstane() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }
}
