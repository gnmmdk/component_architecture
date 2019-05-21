package com.kangjj.manecomponent;

import android.app.Application;

import com.kangjj.component.lib.IAppComponent;
import com.kangjj.component.lib.ServiceFactory;

public class MineApp extends Application implements IAppComponent {
    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application application) {
        this.application = application;
        ServiceFactory.getInstance().setMineService(new MineService());

    }
}
