package com.moveimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

//0816
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.iv).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                Toast.makeText(MainActivity.this,"onClickonClick",Toast.LENGTH_SHORT).show();
                Log.i("","");
            }
        });

    }
}
