package com.example.dagger2demotow.app;

import android.app.Application;

import com.example.dagger2demotow.di.compotion.AppComponent;
import com.example.dagger2demotow.di.compotion.DaggerAppComponent;
import com.example.dagger2demotow.di.module.DatabaseModule;

public class App extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent
                .builder()
                .application(this)
                .DatabaseModule(new DatabaseModule(this))
                .build();

        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
