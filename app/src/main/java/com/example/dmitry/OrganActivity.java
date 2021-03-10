package com.example.dmitry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrganActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.organ_activity);

        View img1 = (View) findViewById(R.id.alc_btn);
        img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrganActivity.this, AlcanActivity.class);
                startActivity(intent);
            }
        });

        View img2 = (View) findViewById(R.id.cyclealc_btn);
        img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrganActivity.this, CyclealcActivity.class);
                startActivity(intent);
            }
        });

        View img3 = (View) findViewById(R.id.alcen_btn);
        img3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrganActivity.this, AlcenActivity.class);
                startActivity(intent);
            }
        });

        View img4 = (View) findViewById(R.id.alcin_btn);
        img4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrganActivity.this, AlcinActivity.class);
                startActivity(intent);
            }
        });

        View img5 = (View) findViewById(R.id.aren_btn);
        img5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrganActivity.this, ArenActivity.class);
                startActivity(intent);
            }
        });
    }
}
