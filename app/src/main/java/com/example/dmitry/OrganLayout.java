package com.example.dmitry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrganLayout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.organ_layout);

        View img1 = (View) findViewById(R.id.ch_btn);
        img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrganLayout.this, OrganActivity.class);
                startActivity(intent);
            }
        });

        View img2 = (View) findViewById(R.id.cho_btn);
        img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrganLayout.this, ChoActivity.class);
                startActivity(intent);
            }
        });

        TextView textView1 = (TextView) findViewById(R.id.cho_text_view);
        String choInfo = "Кислородосодержащие" +
                "\nуглеводороды";
        textView1.setText(choInfo);
    }
}