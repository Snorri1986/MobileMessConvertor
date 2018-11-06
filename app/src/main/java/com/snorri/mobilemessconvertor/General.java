package com.snorri.mobilemessconvertor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class General extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);


        //CELC->FAHR
        Button celc_to_fahr_button = findViewById(R.id.c_f_btn);
        celc_to_fahr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String marker = "CF";
                Intent cf = new Intent(General.this,Worker.class);
                cf.putExtra("BUTTON_MARKER",marker);
                startActivity(cf);

            }
        });

        //FAHR->CELC
        Button fahr_to_celc_button = findViewById(R.id.f_c_btn);
        fahr_to_celc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "FC";
                Intent fc = new Intent(General.this,Worker.class);
                fc.putExtra("BUTTON_MARKER",marker);
                startActivity(fc);
            }
        });

        //KELVIN->CELC
        Button kelvin_to_celc_button = findViewById(R.id.kelv_c_btn);
        kelvin_to_celc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "KC";
                Intent kc = new Intent(General.this,Worker.class);
                kc.putExtra("BUTTON_MARKER",marker);
                startActivity(kc);
            }
        });

        //LANDM->KM
        Button landm_to_km_button = findViewById(R.id.lm_km_btn);
        landm_to_km_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "LMKM";
                Intent lmkm = new Intent(General.this,Worker.class);
                lmkm.putExtra("BUTTON_MARKER",marker);
                startActivity(lmkm);
            }
        });

        //KM->LANDM
        Button km_to_landm_button = findViewById(R.id.km_lm_btn);
        km_to_landm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "KMLM";
                Intent kmlm = new Intent(General.this,Worker.class);
                kmlm.putExtra("BUTTON_MARKER",marker);
                startActivity(kmlm);
            }
        });

        //KM->SEAM
        Button km_to_seam_button = findViewById(R.id.km_seam_btn);
        km_to_seam_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "KMSM";
                Intent kmsm = new Intent(General.this,Worker.class);
                kmsm.putExtra("BUTTON_MARKER",marker);
                startActivity(kmsm);
            }
        });

        //SEAM->KM
        Button seam_to_km_button = findViewById(R.id.seam_km_btn);
        seam_to_km_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "SMKM";
                Intent smkm = new Intent(General.this,Worker.class);
                smkm.putExtra("BUTTON_MARKER",marker);
                startActivity(smkm);
            }
        });

        //INCH->SM
        Button inch_to_sm_button = findViewById(R.id.inch_sm_btn);
        inch_to_sm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "INCHSM";
                Intent inchsm = new Intent(General.this,Worker.class);
                inchsm.putExtra("BUTTON_MARKER",marker);
                startActivity(inchsm);
            }
        });

        //SM->INCH
        Button sm_to_inch_button = findViewById(R.id.sm_inch_btn);
        sm_to_inch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "SMINCH";
                Intent sminch = new Intent(General.this,Worker.class);
                sminch.putExtra("BUTTON_MARKER",marker);
                startActivity(sminch);
            }
        });

        //FUT->M
        Button fut_to_m_button = findViewById(R.id.fut_m_btn);
        fut_to_m_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "FUTM";
                Intent futm = new Intent(General.this,Worker.class);
                futm.putExtra("BUTTON_MARKER",marker);
                startActivity(futm);
            }
        });

        //M->FUT
        Button m_to_fut_button = findViewById(R.id.m_fut_btn);
        m_to_fut_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "MFUT";
                Intent mfut = new Intent(General.this,Worker.class);
                mfut.putExtra("BUTTON_MARKER",marker);
                startActivity(mfut);
            }
        });

        //GAL->LITR
        Button gal_to_litr_button = findViewById(R.id.gal_lit_btn);
        gal_to_litr_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "GALLITR";
                Intent gallitr = new Intent(General.this,Worker.class);
                gallitr.putExtra("BUTTON_MARKER",marker);
                startActivity(gallitr);
            }
        });

        //LITR->GAL
        Button litr_gal_to_button = findViewById(R.id.lit_gal_btn);
        litr_gal_to_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "LITRGAL";
                Intent litrgal = new Intent(General.this,Worker.class);
                litrgal.putExtra("BUTTON_MARKER",marker);
                startActivity(litrgal);
            }
        });

        //YARD->M
        Button yard_to_m_button = findViewById(R.id.yard_met_btn);
        yard_to_m_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "YARDM";
                Intent yardm = new Intent(General.this,Worker.class);
                yardm.putExtra("BUTTON_MARKER",marker);
                startActivity(yardm);
            }
        });

        //M->YARD
        Button m_to_yard_button = findViewById(R.id.met_yard_btn);
        m_to_yard_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marker = "MYARD";
                Intent myard = new Intent(General.this,Worker.class);
                myard.putExtra("BUTTON_MARKER",marker);
                startActivity(myard);
            }
        });



    }
}
