package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void downloadTools(View view) {

//            DownloadManager downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
//
//            //Uri uri=Uri.parse("https://www.vssut.ac.in/lecture_notes/lecture1424354156.pdf");
//
//            Uri uri=Uri.parse("http://www.vhankadephotography.badak.in/react-portfolio.zip");
//
//            DownloadManager.Request request=new DownloadManager.Request(uri);
//
//            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//
//            Long reference=downloadManager.enqueue(request);

        Intent i=new Intent(this,EditingTools.class);
        startActivity(i);

    }
}