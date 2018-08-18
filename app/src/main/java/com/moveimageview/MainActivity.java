package com.moveimageview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;



//
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //点击事件冲突，内部已解决
        findViewById(R.id.iv).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                Toast.makeText(MainActivity.this,"onClickonClick",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
