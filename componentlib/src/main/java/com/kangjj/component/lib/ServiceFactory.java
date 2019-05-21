package com.kangjj.component.lib;

import com.kangjj.component.lib.impl.EmptyLoginService;
import com.kangjj.component.lib.impl.EmptyMineService;
import com.kangjj.component.lib.service.ILoginService;
import com.kangjj.component.lib.service.IMineService;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    public static ServiceFactory getInstance(){
        return instance;
    }
    private ServiceFactory(){}

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getLoginService() {
        if(mLoginService == null){
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setLoginService(ILoginService loginService) {
        this.mLoginService = loginService;
    }

    public IMineService getMineService() {
        if(mMineService == null){
            mMineService = new EmptyMineService();
        }
        return mMineService;
    }

    public void setMineService(IMineService mineService) {
        this.mMineService = mineService;
    }
}
