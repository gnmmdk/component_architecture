package com.kangjj.component.lib.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public interface IMineService {
    void launch(Activity context, int userId,int requestCode);
}
