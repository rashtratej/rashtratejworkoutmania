package com.example.workoutmania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    public LinearLayout biceps;
    public LinearLayout chest;
    public LinearLayout legs;
    public LinearLayout fullbody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        biceps=findViewById(R.id.laybiceps);
        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , bicepsActivity.class);
                startActivity(intent);
            }
        });

        chest=findViewById(R.id.laychest);
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , chestActivity.class);
                startActivity(intent);
            }
        });


        legs=findViewById(R.id.laylegs);
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , legsActivity.class);
                startActivity(intent);
            }
        });


        fullbody=findViewById(R.id.layfullbody);
        fullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , fullbodyActivity.class);
                startActivity(intent);
            }
        });
    }

}