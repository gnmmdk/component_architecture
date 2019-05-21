package com.kangjj.component.lib.impl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.kangjj.component.lib.service.ILoginService;

public class EmptyLoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {

    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
