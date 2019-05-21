package com.kangjj.component.architecture.app;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.kangjj.component.lib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        ServiceFactory.getInstance().getLoginService().launch(this,"");
    }

    public void goMine(View view){
        ServiceFactory.getInstance().getMineService().launch(this,2 ,REQUEST_CODE);
    }

    public void getFragment(View view){
        ServiceFactory.getInstance().getLoginService().newUserInfoFragment(getSupportFragmentManager(),R.id.container,new Bundle());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK){
            Toast.makeText(this,data.getStringExtra("fromMine"),Toast.LENGTH_LONG).show();
        }
    }
}
