package com.covalent.uk.daggerhiltapp;

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;

@HiltAndroidApp
public class DaggerHiltAppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
