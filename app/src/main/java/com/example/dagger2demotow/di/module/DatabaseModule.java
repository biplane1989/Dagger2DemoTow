package com.example.dagger2demotow.di.module;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.example.dagger2demotow.db.StudentDatabase;
import com.example.dagger2demotow.db.StudentRepository;
import com.example.dagger2demotow.db.dao.StudentDAO;
import com.example.dagger2demotow.di.ApplicationContext;
import com.example.dagger2demotow.di.DatabaseInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {


    @ApplicationContext
    private final Context context;

    @DatabaseInfo
    private final String dbName = "orange";

    public DatabaseModule(@ApplicationContext Context applicationContext) {
        context = applicationContext;
    }

    @Singleton
    @Provides
    StudentDatabase provideDatabase(Application application) {
        return Room.databaseBuilder(
                application,
                StudentDatabase.class,
                dbName
        ).fallbackToDestructiveMigration().build();
    }


    @Singleton
    @Provides
    StudentDAO provideStudentDAO(StudentDatabase db) {
        return db.studentDAO();
    }

    @Singleton
    @Provides
    StudentRepository providerStudentRepositor() {
        return new StudentRepository();
    }
}
