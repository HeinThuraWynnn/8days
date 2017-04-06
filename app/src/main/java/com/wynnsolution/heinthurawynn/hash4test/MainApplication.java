package com.wynnsolution.heinthurawynn.hash4test;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Hein Thura Wynn on 4/6/2017.
 */

public class MainApplication extends Application {
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
