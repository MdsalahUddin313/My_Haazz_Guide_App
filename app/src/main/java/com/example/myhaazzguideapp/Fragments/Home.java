package com.example.myhaazzguideapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myhaazzguideapp.Books.pdf_books;
import com.example.myhaazzguideapp.R;
import com.example.myhaazzguideapp.guide.Details;
import com.example.myhaazzguideapp.guide.MyListAdapter;
import com.example.myhaazzguideapp.guide.UserGuide;

public class Home extends Fragment {
    ListView list;

    String[] maintitle = {
            "প্রাক নিবন্ধন ",
            "নিবন্ধন",
            "রেজিস্ট্রেশন প্রক্রিয়া",
            "হজের প্রস্তুতি:\n",
            "হজযাত্রীদের বাংলাদেশ পর্বে করণীয় : \n",
            "আশকোনা হজ ক্যাম্প/বিমান বন্দর এবং বিমানে করণীয়:\n",
            "বিমান থেকে নামার পর করণীয় \n",
            "মক্কায় পৌঁছর পর করণীয়\n",
            "হজের সময় করণীয়\n",
            "মদিনায় গমন ও করণীয়\n",
            "দেশে ফেরার সময় করণীয়\n",


            "সফরের দো'আ",
            "হজ-উমরার বিধি-নিষেধ জানা অবশ্য কর্তব্য কেন?",
            "হজ:",
            "উমরা:",
            "হজ ও উমরার ফযীলত\n",
            "হজের প্রকারভেদ",
            "১. তামাত্তু হজ\n",
            "২. কিরান হজ\n",
            "৩. ইফরাদ হজ",
            "হজযাত্রীদের করনীয়",
            "হজ এজেন্সির করনীয়",
            "হজ গাইডের করনীয় ",




            "হজযাত্রীদের স্বাস্থ্য সেবা কার্যক্রম",
            "হজযাত্রীদের স্বাস্থ্য সেবা",
            "হাজযাত্রীদের সুস্বাস্থ্য ও নিরাপত্তা রক্ষায় করণীয়",

    };

    String[] subtitle = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
    };

    Integer[] imgid = {
            R.drawable.app_logo, R.drawable.c,
            R.drawable.p, R.drawable.spelist,
            R.drawable.one_pad,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewgroup = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);

        MyListAdapter adapter = new MyListAdapter(getActivity(), maintitle);
        list = viewgroup.findViewById(R.id.listView_id);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub



                if(position == 2) {
                    //code specific to 2nd list item
                    Intent i2=new Intent(getActivity(), pdf_books.class);
                    i2.putExtra("pos","3");
                    startActivity(i2);
                }else {
                    String p = String.valueOf(position);
                    Intent i = new Intent(getActivity(), Details.class);
                    i.putExtra("pos", p);

                    startActivity(i);
                }



            }
        });
        return viewgroup;

        /*
           if(position == 0) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","0");
                    startActivity(i);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","1");
                    startActivity(i);
                }

                else if(position == 2) {

                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","2");
                    startActivity(i);
                }
                else if(position == 3) {

                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","3");
                    startActivity(i);
                }
                else if(position == 4) {

                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","4");
                    startActivity(i);
                }


                if(position == 5) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","5");
                    startActivity(i);
                }

                else if(position == 6) {
                    //code specific to 2nd list item
                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","6");
                    startActivity(i);
                }

                else if(position == 7) {

                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","7");
                    startActivity(i);
                }
                else if(position == 8) {

                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","8");
                    startActivity(i);
                }
                else if(position == 9) {

                    Intent i=new Intent(getActivity(),Details.class);
                    i.putExtra("pos","9");
                    startActivity(i);
                }

         */
    }

}

