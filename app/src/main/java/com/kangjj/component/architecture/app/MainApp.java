package com.kangjj.component.architecture.app;

import android.app.Application;

import com.kangjj.component.lib.AppConfig;
import com.kangjj.component.lib.IAppComponent;

public class MainApp extends Application implements IAppComponent {
    private MainApp application;

    public MainApp getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }
    //组件实例化
    @Override
    public void initializa(Application application) {
        this.application = (MainApp) application;
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof  IAppComponent){
                    ((IAppComponent)object).initializa(application);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
