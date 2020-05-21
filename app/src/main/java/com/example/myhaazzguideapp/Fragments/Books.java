package com.example.myhaazzguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.myhaazzguideapp.Books.pdf_books;
import com.example.myhaazzguideapp.R;

public class Books extends Fragment implements  View.OnClickListener {

    ImageButton buttonOne,buttonTwo,buttonThree;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_books, container, false);
        buttonOne=viewGroup.findViewById(R.id.prothomALo_id);buttonOne.setOnClickListener(this);
        buttonTwo=viewGroup.findViewById(R.id.button);buttonTwo.setOnClickListener(this);
        buttonThree=viewGroup.findViewById(R.id.button3);buttonThree.setOnClickListener(this);
    return viewGroup;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.prothomALo_id:
                Intent i=new Intent(getActivity(), pdf_books.class);
                i.putExtra("pos","0");
                startActivity(i);
            break;
            case R.id.button:
                Intent i2=new Intent(getActivity(), pdf_books.class);
                i2.putExtra("pos","1");
                startActivity(i2);
                break;

            case R.id.button3:
                Intent i3=new Intent(getActivity(), pdf_books.class);

                i3.putExtra("pos","2");startActivity(i3);
                break;
        }
    }
}
