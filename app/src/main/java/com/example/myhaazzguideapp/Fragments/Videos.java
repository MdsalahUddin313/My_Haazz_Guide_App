package com.example.myhaazzguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myhaazzguideapp.Links_video.MyListAdapter_Link;
import com.example.myhaazzguideapp.Links_video.WebView_link;
import com.example.myhaazzguideapp.R;
import com.example.myhaazzguideapp.guide.Details;
import com.example.myhaazzguideapp.guide.MyListAdapter;
import com.example.myhaazzguideapp.guide.UserGuide;

public class Videos extends Fragment {

    ListView list;
    String[] maintitle ={
            "How to Perform Hajj-Step By Step Hajj Guide ",
            "Bangla Waz How to Perform Hajj Step by Step in Bangla",
            "How to Perform Hajj Step by Step ","পবিত্র হজ্জ | কি কেন কিভাবে | Hajj"
    };

    String[] subtitle ={
            "English","by Amanullah Madani",
            "in Bangla 2018","by কি কেন কিভাবে ",

    };

    Integer[] imgid={
            R.drawable.one_link,R.drawable.two_link,
            R.drawable.three_link,R.drawable.four_link,
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_videos, container, false);
        MyListAdapter_Link adapter=new  MyListAdapter_Link(getActivity(), maintitle, subtitle,imgid);
        list=viewGroup.findViewById(R.id.link_listview_id);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Intent i=new Intent(getActivity(), WebView_link.class);
                    i.putExtra("pos","0");
                    //https://youtu.be/Hb-ngN7pVyw
                    startActivity(i);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(), WebView_link.class);
                    i.putExtra("pos","1");
                    //https://www.youtube.com/watch?v=ws47UpVRkgE
                    startActivity(i);
                }

                else if(position == 2) {

                    Intent i=new Intent(getActivity(),WebView_link.class);
                    i.putExtra("pos","2");
                    //https://www.youtube.com/watch?v=Nk68pjWqaXg
                    startActivity(i);
                }
                else if(position == 3) {

                    Intent i=new Intent(getActivity(),WebView_link.class);
                    i.putExtra("pos","3");
                    //https://youtu.be/to_gLNjfDto
                    startActivity(i);
                }


            }
        });

    return viewGroup;
    }
}
