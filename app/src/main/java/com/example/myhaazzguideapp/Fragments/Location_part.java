package com.example.myhaazzguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.myhaazzguideapp.Quiz_part.Hajj_quiz;
import com.example.myhaazzguideapp.Quiz_part.Qibla;
import com.example.myhaazzguideapp.Quiz_part.Tasbeeh;
import com.example.myhaazzguideapp.R;

public class Location_part extends Fragment implements View.OnClickListener{

    ImageButton Quiz,Tasbeehbtn,Qiblabtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_location, container, false);

        Quiz=viewGroup.findViewById(R.id.Quiz_id);Quiz.setOnClickListener(this);
        Tasbeehbtn=viewGroup.findViewById(R.id.Tasbeeh_id);Tasbeehbtn.setOnClickListener(this);
        Qiblabtn=viewGroup.findViewById(R.id.Qibla_id);Qiblabtn.setOnClickListener(this);
    return viewGroup;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.Quiz_id:
                Intent i= new Intent(getActivity(), Hajj_quiz.class);startActivity(i);
                break;
            case R.id.Tasbeeh_id:
                Intent i2= new Intent(getActivity(), Tasbeeh.class);startActivity(i2);
                break;
            case R.id.Qibla_id:
                Intent i3= new Intent(getActivity(), Qibla.class);startActivity(i3);
                break;
        }
    }
}
