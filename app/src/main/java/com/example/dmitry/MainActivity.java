package com.example.dmitry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton img1 = (ImageButton) findViewById(R.id.neorg_btn);
        img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NeorganActivity.class);
                startActivity(intent);
            }
        });

        ImageButton img2 = (ImageButton) findViewById(R.id.org_btn);
        img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, OrganLayout.class);
                startActivity(intent1);
            }
        });
    }
}
