package com.kangjj.manecomponent;

import android.app.Activity;
import android.content.Intent;

import com.kangjj.component.lib.service.IMineService;

public class MineService implements IMineService {
    @Override
    public void launch(Activity context, int userId,int requestCode) {
        Intent intent = new Intent(context,MineActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("ID",userId);
        context.startActivityForResult(intent,requestCode);
    }
}
