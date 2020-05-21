package com.example.myhaazzguideapp.Dua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.myhaazzguideapp.R;
import com.example.myhaazzguideapp.guide.Details;
import com.example.myhaazzguideapp.guide.UserGuide;

public class Dua_items extends AppCompatActivity {
    GridView list;
    String[] maintitle={"ঘুমানোর সময় পড়ার দোয়া",
            " ঘুম থেকে উঠে পড়ার দোয়া",
            "পেশাবখানা বা পায়খানায় ঢুকার সময় পড়ার দোয়া",
            "টয়লেট থেকে ছেড়ে যাওয়া",
            "ওযুর দোয়া",
            "ওযুর সমাপ্তি",
            "মসজিদে প্রবেশ করার সময়ের দোয়া",
            "মসজিদ হতে বের হওয়ার সময়ের দোয়া",
            "খাবার গ্রহণের দোয়া",
            "বিসমিল্লাহ তেলাওয়াত করতে ভুলে যাচ্ছি",
            "খাবার শেষের দোয়া",
            "বাসা হতে বের হওয়ার সময়ের দোয়া",
            "ঘরে প্রবেশ করার দোয়া",
            "যাত্রা",
            "যাত্রা থেকে ফিরে",
            "হাঁচি দিলে",
            "কারও হাঁচি শুনে",
            "হাঁচি জবাব দেয়",
            "আযানের দোয়া ",

    };
//"FAQ","Terms &Condition","Support Center","About Us",
    Integer[] imgid={
            R.drawable.c,R.drawable.app_logo,
            R.drawable.one_pad,R.drawable.p,
            R.drawable.spelist,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_items);


    }
}
