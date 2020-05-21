package com.example.myhaazzguideapp.Dua;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myhaazzguideapp.R;

public class MyListAdapter_Dua extends ArrayAdapter {
    private final Activity context;
    private final String[] maintitle;
   // private final Integer[] imgid;

    public MyListAdapter_Dua(Activity context, String[] maintitle) {
        super(context, R.layout.account_list_item_text_id, maintitle);
        // TODO Auto-generated constructor stub
       this.context= context;
        this.maintitle=maintitle;
        //this.imgid=imgid;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.dua_grid_list, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.grid_text_id);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.account_list_item_image_id);

        titleText.setText(maintitle[position]);
        //imageView.setImageResource(imgid[position]);

        return rowView;

    };
}
