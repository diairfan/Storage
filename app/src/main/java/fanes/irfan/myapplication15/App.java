package fanes.irfan.myapplication15;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Van Noval on 12/26/2017.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableWebKitInspector(
                                Stetho.defaultInspectorModulesProvider(this)
                        )
                        .build()
        );
    }
}
