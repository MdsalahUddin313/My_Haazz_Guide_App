package com.example.myhaazzguideapp.Quiz_part;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myhaazzguideapp.R;

public class Tasbeeh extends AppCompatActivity implements View.OnClickListener {
    private Button tasbeeh_button, reset_button, save_data_button, Progress_button;
    EditText target_count_value;
    private TextView Count_value_text;

    String value;
    ProgressBar progressBar;
    double progress = 0.0;
    public float maximun_value_number;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbeeh);

        target_count_value = findViewById(R.id.text3_id);


        save_data_button = findViewById(R.id.save_button_id);
        save_data_button.setOnClickListener(this);
        tasbeeh_button = (Button) findViewById(R.id.tasbeeh_click_button);
        tasbeeh_button.setOnClickListener(this);
        reset_button = (Button) findViewById(R.id.reset_id);
        reset_button.setOnClickListener(this);

        Count_value_text = (TextView) findViewById(R.id.text2_id);
        Progress_button = (Button) findViewById(R.id.progress_button_id);




  /*
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }

        });
        thread.start();

   */

    }

    @Override
    public void onClick(View v) {
        // maximun_value_number=Float.parseFloat(number);
        switch (v.getId()) {
            case R.id.tasbeeh_click_button:
                try {


                    if (maximun_value_number != 0) {
                        count++;

                        Count_value_text.setText(""+count);

                    } else if (maximun_value_number == 0.0) {
                        Toast.makeText(getApplicationContext(), "Please Set your target.", Toast.LENGTH_SHORT).show();
                        Progress_button.setText("PROGRESS");
                    }
                } catch (Exception e) {
                }
                int result = (int) ((count * 100) /maximun_value_number);
                Progress_button.setText("" + result + "%");
                break;

            case R.id.reset_id:
                count = 0;
                Count_value_text.setText("00");
                Progress_button.setText("PROGRESS");
                Toast.makeText(getApplicationContext(), "All Values Are Refreshed.", Toast.LENGTH_SHORT).show();
                target_count_value.setText("");
                break;

            case R.id.save_button_id:
                try {
                    value = target_count_value.getText().toString();
                    maximun_value_number = Float.parseFloat(value);
                    Toast.makeText(getApplicationContext(), "Your Value is Set.", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "" + e, Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }

/*
    private void doWork() {
        int result = (int) ((maximun_value_number * 100) / count);
        progressBar.setProgress(result);
    }

 */
    }

