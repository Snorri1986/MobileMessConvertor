package com.snorri.mobilemessconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Worker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker);

        //test code
        String externalText = getIntent().getStringExtra("BUTTON_MARKER");

        // Replace test code on C++ method calling
        switch(externalText) {
            case "CF" : {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "FC" : {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "KC" : {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "LMKM" : {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "KMLM": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "KMSM": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "SMKM": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "INCHSM": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "SMINCH": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "FUTM": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "MFUT": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "GALLITR": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "LITRGAL": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "YARDM": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }

            case "MYARD": {
                TextView test_text = findViewById(R.id.test_text_view);
                test_text.setText(externalText);
                break;
            }
        }

        /**/

    }
}
