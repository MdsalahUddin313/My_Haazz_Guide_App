package com.example.myhaazzguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myhaazzguideapp.Links_video.MyListAdapter_Link;
import com.example.myhaazzguideapp.Links_video.WebView_link;
import com.example.myhaazzguideapp.R;
import com.example.myhaazzguideapp.guide.Details;
import com.example.myhaazzguideapp.guide.MyListAdapter;
import com.example.myhaazzguideapp.guide.UserGuide;

public class Videos extends Fragment {

    ListView list;
    String URL;
    EditText search_item;
    ImageButton search;
    String[] maintitle ={
            "A step-by-step guide to Hajj | Hajj News | Al Jazeera ",
            "Bangladesh Hajj Management Portal",
            "hajj and umrah guide book free download - Hajj Essential",
            "How Hajj is performed-A step by step Hajj guide"
    };

    String[] subtitle ={
            "English in Al jazeera",
            "by Government",
            "in English",
            "by Islamic Finder ",

    };

    Integer[] imgid={
            R.drawable.one_l,R.drawable.two_l,
            R.drawable.three_l,R.drawable.four_l,
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_videos, container, false);
        MyListAdapter_Link adapter=new  MyListAdapter_Link(getActivity(), maintitle, subtitle,imgid);
        list=viewGroup.findViewById(R.id.link_listview_id);
        list.setAdapter(adapter);

        search_item=viewGroup.findViewById(R.id.seach_id);

        search=viewGroup.findViewById(R.id.Search_button_id);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), WebView_link.class);
                URL=search_item.getText().toString().toLowerCase();
                i.putExtra("pos","4");
                i.putExtra("Link",URL);
                Toast.makeText(getActivity(),""+URL,Toast.LENGTH_LONG).show();
                //https://youtu.be/Hb-ngN7pVyw
                startActivity(i);
            }
        });


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
