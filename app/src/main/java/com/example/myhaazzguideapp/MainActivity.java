package com.example.myhaazzguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhaazzguideapp.Dua.Dua_items;
import com.example.myhaazzguideapp.MyLocation.GeoLocation;
import com.example.myhaazzguideapp.guide.UserGuide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button=findViewById(R.id.button_id);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this, BottomNevigation_bar.class);
            startActivity(i);
        }
    });

    }
}
