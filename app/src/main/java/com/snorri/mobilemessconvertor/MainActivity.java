/*
Author: Denys Shabelnyk
Date: 23.10.2018 00:26
*/

package com.snorri.mobilemessconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    /*static {
        System.loadLibrary("native-lib");
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Exit action from WorkerActivity
        if(getIntent().getBooleanExtra("EXIT",false))
        {
            finish();
        }

        // Close application from "Exit" button
        Button ext_button = findViewById(R.id.close_btn);
        ext_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });


        // Enter to General Activity
        Button start_btn = findViewById(R.id.start_btn);
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openGeneralActivity = new Intent(MainActivity.this,General.class);
                startActivity(openGeneralActivity);
            }
        });

    }

}
