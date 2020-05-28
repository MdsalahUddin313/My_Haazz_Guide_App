package com.example.myhaazzguideapp.Links_video;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myhaazzguideapp.R;

public class WebView_link extends AppCompatActivity {

    private WebView web;
    TextView t1;
    String Search_item;
    String[] str1= {"https://youtu.be/Hb-ngN7pVyw",
            "https://www.youtube.com/watch?v=ws47UpVRkgE",
            "https://www.youtube.com/watch?v=Nk68pjWqaXg",
            "https://youtu.be/to_gLNjfDto",
            "https://www.google.com/search?q=",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        web= (WebView)findViewById(R.id.web_id);

        Intent i= getIntent();
        int position=Integer.parseInt(i.getStringExtra("pos"));
        Intent i2= getIntent();
        Search_item=i.getStringExtra("Link");
        //t1=findViewById(R.id.textView_id);

        if(position==0){
        String s1=str1[0];
            webaddress(s1);
        }else  if(position==1){
            String s2=str1[1];
            webaddress(s2);
        }
        else  if(position==2){
            String s3=str1[2];
            webaddress(s3);
        }
        else  if(position==3){
            String s4=str1[3];
            webaddress(s4);
        }
        else  if(position==4){
            String s5=(str1[4]+Search_item);

            webaddress(s5);
        }
    }

    private void webaddress(String url){

        // set web view client
        web.setWebViewClient(new MyWebViewClient());

        // string url which you have to load into a web view

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(url); // load the url on the web view
    }

    // custom web view client class who extends WebViewClient
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url); // load the url
            return true;
        }
    }

}
