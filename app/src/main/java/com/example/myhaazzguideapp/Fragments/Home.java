package com.example.myhaazzguideapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myhaazzguideapp.R;

public class Home extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewgroup= (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);
    return  viewgroup;
    }
}
