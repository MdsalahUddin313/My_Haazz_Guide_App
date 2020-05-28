package com.example.myhaazzguideapp.Quiz_part;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myhaazzguideapp.Fragments.Location;
import com.example.myhaazzguideapp.R;

public class ResultActivity extends AppCompatActivity {
    TextView tv, tv2, tv3;
    Button btnRestart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv = (TextView)findViewById(R.id.tvres);
        tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);
        btnRestart = (Button) findViewById(R.id.btnRestart);



         if(Hajj_quiz.t_correct>0 &&Hajj_quiz.t_wrong>0&&Hajj_quiz.t_correct>0) {
            StringBuffer sb4 = new StringBuffer();
            sb4.append("Correct answers: " + Hajj_quiz.t_correct + "\n");
            StringBuffer sb5 = new StringBuffer();
            sb5.append("Wrong Answers: " + Hajj_quiz.t_wrong + "\n");
            StringBuffer sb6 = new StringBuffer();
            sb6.append("Final Score: " + Hajj_quiz.t_correct + "\n");
            tv.setText(sb4);
            tv2.setText(sb5);
            tv3.setText(sb6);
            Hajj_quiz.t_correct=0;
            Hajj_quiz.t_wrong=0;
        }

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), Location.class);
                startActivity(in);
            }
        });
    }

}
