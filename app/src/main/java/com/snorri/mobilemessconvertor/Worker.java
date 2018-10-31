package com.snorri.mobilemessconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Worker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker);

        // buttons handlers

        // Clear button
        Button btn_clear = findViewById(R.id.clear_btn);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ed_txt = findViewById(R.id.value);
                ed_txt.setText(" ");
            }
        });

        // Back button
        Button btn_back = findViewById(R.id.back_btn);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent general_back = new Intent(Worker.this,General.class);
                startActivity(general_back);
            }
        });

        // Convert button
        Button btn_convert = findViewById(R.id.convert_btn);
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // test
                String filled_text;
                EditText field_txt = findViewById(R.id.value);
                filled_text = field_txt.getText().toString();
                showConvertedResult(filled_text);
                /**/
            }
        });
        /**/

        // call core method(test)
        // showConvertedResult();

        }

        void showConvertedResult(String show_val) {
        // test c++ object
            MyCpp my_native = new MyCpp();

        //test code
        String externalText = getIntent().getStringExtra("BUTTON_MARKER");

        // Replace test code on C++ method calling
        switch (externalText) {
            // test c++
            case "CF": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.showFaringeith(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(show_val); // test
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            // test c++
            case "FC": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.showCelcius(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            // test c++
            case "KC": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.showCelciusFromKelvin(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "LMKM": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.landMiletoKm(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "KMLM": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.kmToLandMile(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "KMSM": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.kmToSeaMiles(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "SMKM": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.seaMilestoKm(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "INCHSM": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.inchToSm(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "SMINCH": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.smToInch(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "FUTM": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.ftToMeter(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "MFUT": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.meterToFt(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "GALLITR": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.gallToLitr(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "LITRGAL": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.litrToGall(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "YARDM": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.yardToMeter(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }

            case "MYARD": {
                // test code
                double val = Double.parseDouble(show_val); // test
                val = my_native.meterToYard(val); // test
                TextView test_text = findViewById(R.id.test_text_view);
                //test_text.setText(externalText);
                test_text.setText(String.valueOf(val)); // test
                break;
            }
        }
    }
}
