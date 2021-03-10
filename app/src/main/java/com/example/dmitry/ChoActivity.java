package com.example.dmitry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cho_layout);

        View img1 = (View) findViewById(R.id.alcohol_btn);
        img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoActivity.this, AlcoholActivity.class);
                startActivity(intent);
            }
        });

        View img2 = (View) findViewById(R.id.aldegid_btn);
        img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoActivity.this, AldegidActivity.class);
                startActivity(intent);
            }
        });

        View img3 = (View) findViewById(R.id.ckisl_btn);
        img3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoActivity.this, KarbActivity.class);
                startActivity(intent);
            }
        });

        View img4 = (View) findViewById(R.id.efir_btn);
        img4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoActivity.this, EfirActivity.class);
                startActivity(intent);
            }
        });

        View img5 = (View) findViewById(R.id.uglv_btn);
        img5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoActivity.this, VseUglvActivity.class);
                startActivity(intent);
            }
        });

        View img6 = (View) findViewById(R.id.fats_btn);
        img6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoActivity.this, ZhirActivity.class);
                startActivity(intent);
            }
        });


        TextView textView1 = (TextView) findViewById(R.id.efir_text_view);
        String efInfo = "Сложные" +
                "\nэфиры";
        textView1.setText(efInfo);

        TextView textView2 = (TextView) findViewById(R.id.kisl_text_view);
        String kisInfo = "Карбоновые" +
                "\nкислоты";
        textView2.setText(kisInfo);
    }
}