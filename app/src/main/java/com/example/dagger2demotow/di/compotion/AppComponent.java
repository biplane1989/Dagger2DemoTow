package com.example.dagger2demotow.di.compotion;

import android.app.Application;

import com.example.dagger2demotow.MainActivity;
import com.example.dagger2demotow.app.App;
import com.example.dagger2demotow.di.module.AppModule;
import com.example.dagger2demotow.di.module.DatabaseModule;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DatabaseModule.class})
public interface AppComponent {

    void inject(App app);

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        @BindsInstance
        Builder DatabaseModule(DatabaseModule databaseModule);

        AppComponent build();
    }

}
