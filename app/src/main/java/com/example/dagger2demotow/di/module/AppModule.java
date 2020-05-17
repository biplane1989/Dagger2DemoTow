package com.example.dagger2demotow.di.module;

import android.app.Application;

import com.example.dagger2demotow.app.App;
import com.example.dagger2demotow.di.entity.Student;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {


    @Singleton
    @Provides
    Student student() {
        return new Student("orange");
    }

}
