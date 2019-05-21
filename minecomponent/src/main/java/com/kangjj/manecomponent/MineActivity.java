package com.kangjj.manecomponent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        TextView showId= findViewById(R.id.showId);
        showId.setText(String.valueOf(getIntent().getIntExtra("ID",-1)));
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("fromMine","from mine message");
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}
