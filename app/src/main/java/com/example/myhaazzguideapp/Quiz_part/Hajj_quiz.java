package com.example.myhaazzguideapp.Quiz_part;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myhaazzguideapp.R;

public class Hajj_quiz extends AppCompatActivity {

    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1, rb2, rb3, rb4;

    String questions[] = {
            "1.How many times do Muslims have to perform Hajj in their lifetime?",
            "2.What is the name of the place where the pilgrims pelt stones on pillars representing the devil?",
            "3.What is considered to be the most important part of the Hajj?",
            "4.How many times do the Muslims circumambulate the Kaabah?",
            "5.What does the running or swift walking of pilgrims seven times between the hills of Safaa and Marwah represent?",
            "6.During which month is the Hajj performed?",
            "7.Which Islamic principle does the Hajj demonstrate?",
            "8.What is the state of purity in which all pilgrims enter Makkah for Hajj called?",
            "9.What is Hajj?",
            "10.What do Muslims recite during and throughout the Hajj?",

    };
    String answers[] = {"Once in their lifetime if they are physically and financially able",
            "Al-Jamarat",
            "The day the pilgrims spend praying on the Plains of Arafah",
            "Seven Times",
            "The number of times Hagar ran back and forth between the hills searching for water for her son, Prophet Ishmael (PBUH)",
            "Dhul-Hijjah",
            "Equality and universal brotherhood",
            "Ihram",
            "Pilgrimage to Makkah (Saudi Arabia)",
            "Taalbiya",

    };
    String opt[] = {
            "Every year", "Once in five years","Once in a decade","Once in their lifetime if they are physically and financially able" ,
            "Al-Jamarat","Mina","Muzdalifa","None of the above",
            "When pilgrims circumambulate the Kaabah","When pilgrims stone the Pillars representing the devil","The day the pilgrims spend praying on the Plains of Arafah","Days spent in Mina and Muzdalifah",
            "One Time","Three Times","Five Times","Seven Times",
            "The number of times the Prophet Muhammad performed the Hajj in his lifetime","The number of times the Prophet Abraham (PBUH) tried to build the Kaabah before he succeeded","The number of times Hagar ran back and forth between the hills searching for water for her son, Prophet Ishmael (PBUH)","The number of miles the Prophet Muhammad travelled from Medina to Mecca to perform the Hajj",
            "Dhul-Hijjah","Ramadhan","Muharram","Rajjab",
            "Importance of children","Equality and universal brotherhood","Importance of charity","Celebrations",
            "Adhaan","Ihram","Istikhara","Ababa",
            "Pilgrimage to Shrines","Pilgrimage to Monasteries","Pilgrimage to Makkah (Saudi Arabia)","Family Get-together",
            "Al-Fatiha","Taalbiya","Declaration of Hajj","There is no specific recitation",


    };
    int flag=0 ;
    public static int t_marks = 0, t_correct = 0, t_wrong = 0,last_position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hajj_quiz);


        final TextView score = (TextView) findViewById(R.id.t_text_score);


        /*
          TextView textView = (TextView) findViewById(R.id.DispName);
        Intent intent = getIntent();
        String name = intent.getStringExtra("myname");
        if (name.trim().equals(""))
            textView.setText("Hello User");
        else
            textView.setText("Hello " + name);
         */
        Intent intent = getIntent();
        String name = intent.getStringExtra("catagory");
        if(name=="B"){
            flag=10;
            last_position=19;
        }else if(name=="C"){
            flag=20;
            last_position=29;
        }

        submitbutton = (Button) findViewById(R.id.t_nextQSn_id);
        quitbutton = (Button) findViewById(R.id.t_quitbtn_id);
        tv = (TextView) findViewById(R.id.Tqsn);

        radio_g = (RadioGroup) findViewById(R.id.t_answersgrp);
        rb1 = (RadioButton) findViewById(R.id.t_radioButton);
        rb2 = (RadioButton) findViewById(R.id.t_radioButton2);
        rb3 = (RadioButton) findViewById(R.id.t_radioButton3);
        rb4 = (RadioButton) findViewById(R.id.t_radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[flag * 4]);
        rb2.setText(opt[flag * 4 + 1]);
        rb3.setText(opt[flag * 4 + 2]);
        rb4.setText(opt[flag * 4 + 3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if (radio_g.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if (ansText.equals(answers[flag])) {
                    t_correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    t_wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText("" + t_correct);

                if (flag < questions.length||flag==last_position) {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag * 4]);
                    rb2.setText(opt[flag * 4 + 1]);
                    rb3.setText(opt[flag * 4 + 2]);
                    rb4.setText(opt[flag * 4 + 3]);
                } else {
                    t_marks = t_correct;
                    Intent in = new Intent(getApplicationContext(), ResultActivity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(intent);
            }
        });
    }
}

