package com.example.myhaazzguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.myhaazzguideapp.Dua.Dua_details;
import com.example.myhaazzguideapp.Dua.Dua_items;
import com.example.myhaazzguideapp.Dua.MyListAdapter_Dua;
import com.example.myhaazzguideapp.R;

public class Dua extends Fragment {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.fragment_dua, container, false);
        MyListAdapter_Dua adapter=new MyListAdapter_Dua(getActivity(), maintitle);
        list=viewGroup.findViewById(R.id.Grid_view_id);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Intent i=new Intent(getActivity(), Dua_details.class);
                    i.putExtra("pos","0");
                    startActivity(i);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","1");
                    startActivity(i);
                }

                else if(position == 2) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","2");
                    startActivity(i);
                }
                else if(position == 3) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","3");
                    startActivity(i);
                }
                else if(position == 4) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","4");
                    startActivity(i);
                }

                if(position == 5) {
                    //code specific to first list item
                    Intent i=new Intent(getActivity(), Dua_details.class);
                    i.putExtra("pos","5");
                    startActivity(i);
                }

                else if(position == 6) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","6");
                    startActivity(i);
                }

                else if(position == 7) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","7");
                    startActivity(i);
                }
                else if(position == 8) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","8");
                    startActivity(i);
                }
                else if(position == 9) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","9");
                    startActivity(i);
                }
                if(position == 10) {
                    //code specific to first list item
                    Intent i=new Intent(getActivity(), Dua_details.class);
                    i.putExtra("pos","10");
                    startActivity(i);
                }

                else if(position == 11) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","11");
                    startActivity(i);
                }

                else if(position == 12) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","12");
                    startActivity(i);
                }
                else if(position == 13) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","13");
                    startActivity(i);
                }
                else if(position == 14) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","14");
                    startActivity(i);
                }

                if(position == 15) {
                    //code specific to first list item
                    Intent i=new Intent(getActivity(), Dua_details.class);
                    i.putExtra("pos","15");
                    startActivity(i);
                }

                else if(position == 16) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","16");
                    startActivity(i);
                }

                else if(position == 17) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","17");
                    startActivity(i);
                }
                else if(position == 18) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","18");
                    startActivity(i);
                }
                else if(position == 19) {

                    Intent i=new Intent(getActivity(),Dua_details.class);
                    i.putExtra("pos","19");
                    startActivity(i);
                }

            }
        });
    return viewGroup;
    }
}
