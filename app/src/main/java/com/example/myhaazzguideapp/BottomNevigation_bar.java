package com.example.myhaazzguideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.myhaazzguideapp.Fragments.Books;
import com.example.myhaazzguideapp.Fragments.Dua;
import com.example.myhaazzguideapp.Fragments.Home;
import com.example.myhaazzguideapp.Fragments.Location;
import com.example.myhaazzguideapp.Fragments.Videos;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNevigation_bar extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nevigation_bar);

        Fragment fragment = null;
        final FragmentManager fm = getSupportFragmentManager();
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnevigation_id);
        //loading the default fragmen
        //getting bottom navigation view and attaching the listener
        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);


        //for auto show search screen
        fragment = new Home();
        loadFragment(fragment);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.home:
                fragment = new Home();
                break;

            case R.id.Books_Bottom_menu_id:
                fragment = new Books();
                break;

            case R.id.Dua_Bottom_menu_id:
                fragment = new Dua();
                break;

            case R.id.video:
                fragment = new Videos();
                break;

            case R.id.location_Bottom_menu_id:
                fragment = new Location();
                break;

        }

        return loadFragment(fragment);
    }


    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.Frame_layout_id, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
