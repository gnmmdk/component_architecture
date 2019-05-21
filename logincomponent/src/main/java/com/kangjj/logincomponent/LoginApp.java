package com.kangjj.logincomponent;

import android.app.Application;

import com.kangjj.component.lib.IAppComponent;
import com.kangjj.component.lib.ServiceFactory;

public class LoginApp extends Application implements IAppComponent {
    private static Application application;

    public static Application getApplicatoin(){
        return application;
    }

    //独立运行的时候，这里是入口
    @Override
    public void onCreate() {
        super.onCreate();
        initializa(this);
    }

    @Override
    public void initializa(Application application) {
        this.application = application;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
