package com.example.myhaazzguideapp.Books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myhaazzguideapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class pdf_books extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_books);

        Intent i = getIntent();
        String s = i.getStringExtra("pos");//t1.setText(s);
        int position=Integer.parseInt(s);
        //PDF View
        pdfView = findViewById(R.id.pdfView);

        if(position==0){
            LoadPDF("book_one.pdf");
        }else if(position==1){
            LoadPDF("book_two.pdf");
        }else if(position==2){
            LoadPDF("shot_cut.pdf");
        }
        else if(position==3){
            LoadPDF("registration.pdf");
        }


    }


   void LoadPDF(String bookName){
       pdfView.fromAsset(bookName)
               .enableSwipe(true) // allows to block changing pages using swipe
               .swipeHorizontal(true)
               .enableDoubletap(true)
               .defaultPage(0)
               .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
               .password(null)
               .scrollHandle(null)
               .enableAntialiasing(true) // improve rendering a little bit on low-res screens
               // spacing between pages in dp. To define spacing color, set view background
               .spacing(0)
               .pageFitPolicy(FitPolicy.WIDTH)
               .load();
   }
}
