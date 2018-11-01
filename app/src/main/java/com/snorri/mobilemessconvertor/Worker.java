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
                String filled_text;
                EditText field_txt = findViewById(R.id.value);
                filled_text = field_txt.getText().toString();
                showConvertedResult(filled_text);

            }
        });

        // Exit button
        Button btn_exit_from_WA = findViewById(R.id.exitapp);
        btn_exit_from_WA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        // Show tips
        String externalText_tips = getIntent().getStringExtra("BUTTON_MARKER");
        switch(externalText_tips) {
            case "CF" : {
                String tip = "Conversion from Celsius to Fahrenheit";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "FC" : {
                String tip = "Conversion from Fahrenheit to Celcius";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "KC" : {
                String tip = "Conversion from Kelvin to Celcius";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "LMKM": {
                String tip = "Conversion from LandMile to Kilometer";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "KMLM": {
                String tip = "Conversion from Kilometer to LandMile";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "KMSM": {
                String tip = "Conversion from Kilometer to SeaMile";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "SMKM": {
                String tip = "Conversion from SeaMile to Kilometer";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "INCHSM": {
                String tip = "Conversion from Inches to Santimeter";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "SMINCH": {
                String tip = "Conversion from Santimeter to Inches";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "FUTM": {
                String tip = "Conversion from Futs to Meters";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "MFUT": {
                String tip = "Conversion from Meters to Futs";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "GALLITR": {
                String tip = "Conversion from Gallons to Litters";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "LITRGAL": {
                String tip = "Conversion from Litters to Gallons";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "YARDM": {
                String tip = "Conversion from Yards to Meters";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

            case "MYARD": {
                String tip = "Conversion from Meters to Yards";
                TextView tip_field = findViewById(R.id.help);
                tip_field.setText(tip);
                break;
            }

        }
        /**/
    }

        void showConvertedResult(String show_val) {

        MyCpp my_native = new MyCpp();


        String externalText = getIntent().getStringExtra("BUTTON_MARKER");

        switch (externalText) {
            case "CF": {
                double val = Double.parseDouble(show_val);
                val = my_native.showFaringeith(val);
                TextView inFahrenheit = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.fahrenheit);
                inFahrenheit.setText(res_value);
                break;
            }

            case "FC": {
                double val = Double.parseDouble(show_val);
                val = my_native.showCelcius(val);
                TextView inCelcius = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.celcius);
                inCelcius.setText(res_value);
                break;
            }

            case "KC": {
                double val = Double.parseDouble(show_val);
                val = my_native.showCelciusFromKelvin(val);
                TextView inCelciusfromKelvin = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.celcius);
                inCelciusfromKelvin.setText(res_value);
                break;
            }

            case "LMKM": {
                double val = Double.parseDouble(show_val);
                val = my_native.landMiletoKm(val);
                TextView inKm = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.kilometer);
                inKm.setText(res_value);
                break;
            }

            case "KMLM": {
                double val = Double.parseDouble(show_val);
                val = my_native.kmToLandMile(val);
                TextView inLm = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.landmile);
                inLm.setText(res_value);
                break;
            }

            case "KMSM": {
                double val = Double.parseDouble(show_val);
                val = my_native.kmToSeaMiles(val);
                TextView inSm = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.seamile);
                inSm.setText(res_value);
                break;
            }

            case "SMKM": {
                double val = Double.parseDouble(show_val);
                val = my_native.seaMilestoKm(val);
                TextView inKmfromSm = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.kilometer);
                inKmfromSm.setText(res_value);
                break;
            }

            case "INCHSM": {
                double val = Double.parseDouble(show_val);
                val = my_native.inchToSm(val);
                TextView inSantimeter = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.santim);
                inSantimeter.setText(res_value);
                break;
            }

            case "SMINCH": {
                double val = Double.parseDouble(show_val);
                val = my_native.smToInch(val);
                TextView inInch = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.inch);
                inInch.setText(res_value);
                break;
            }

            case "FUTM": {
                double val = Double.parseDouble(show_val);
                val = my_native.ftToMeter(val);
                TextView inM = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.meter);
                inM.setText(res_value);
                break;
            }

            case "MFUT": {
                double val = Double.parseDouble(show_val);
                val = my_native.meterToFt(val);
                TextView inFuts = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.fut);
                inFuts.setText(res_value);
                break;
            }

            case "GALLITR": {
                double val = Double.parseDouble(show_val);
                val = my_native.gallToLitr(val);
                TextView inLiters = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.litr);
                inLiters.setText(res_value);
                break;
            }

            case "LITRGAL": {
                double val = Double.parseDouble(show_val);
                val = my_native.litrToGall(val);
                TextView inGallons = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.gal);
                inGallons.setText(res_value);
                break;
            }

            case "YARDM": {
                double val = Double.parseDouble(show_val);
                val = my_native.yardToMeter(val);
                TextView inMetersfromYards = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.meter);
                inMetersfromYards.setText(res_value);
                break;
            }

            case "MYARD": {
                double val = Double.parseDouble(show_val);
                val = my_native.meterToYard(val);
                TextView inYards = findViewById(R.id.tv);
                String res_value = String.valueOf(val) + getString(R.string.yard);
                inYards.setText(res_value);
                break;
            }
        }
    }
}
