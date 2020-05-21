package com.example.myhaazzguideapp.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myhaazzguideapp.R;

public class UserGuide extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "হজ্জের ফরজ","হজ্জের ওয়াজিব ",
            "ইহরাম অবস্থায় নিষিদ্ধ কাজ","হজ্জের প্রকার ও নিয়তসমূহ",
            "নিয়্যাত",
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.drawable.app_logo,R.drawable.c,
            R.drawable.p,R.drawable.spelist,
            R.drawable.one_pad,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_guide);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle);
        list=(ListView)findViewById(R.id.listView_id);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Intent i=new Intent(UserGuide.this,Details.class);
                    i.putExtra("pos","0");
                    startActivity(i);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent i=new Intent(UserGuide.this,Details.class);
                    i.putExtra("pos","1");
                    startActivity(i);
                }

                else if(position == 2) {

                    Intent i=new Intent(UserGuide.this,Details.class);
                    i.putExtra("pos","2");
                    startActivity(i);
                }
                else if(position == 3) {

                    Intent i=new Intent(UserGuide.this,Details.class);
                    i.putExtra("pos","3");
                    startActivity(i);
                }
                else if(position == 4) {

                    Intent i=new Intent(UserGuide.this,Details.class);
                    i.putExtra("pos","4");
                    startActivity(i);
                }

            }
        });
    }
}

