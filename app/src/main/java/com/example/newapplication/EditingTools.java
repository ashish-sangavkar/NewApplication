package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EditingTools extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editing_tools);

        final ArrayList<ViewClass> arrayList = new ArrayList<ViewClass>();

        // add all the values from 1 to 15 to the arrayList
        // the items are of the type NumbersView
        arrayList.add(new ViewClass(R.drawable.a1, "a.pdf", "Download"));
        arrayList.add(new ViewClass(R.drawable.img, "b.pdf", "Download"));
        arrayList.add(new ViewClass(R.drawable.img, "c.pdf", "Download"));
        arrayList.add(new ViewClass(R.drawable.img, "d.pdf", "Download"));
        arrayList.add(new ViewClass(R.drawable.img, "e.pdf", "Download"));
        arrayList.add(new ViewClass(R.drawable.img, "f.pdf", "Download"));

        // Now create the instance of the NumebrsViewAdapter and pass
        // the context and arrayList created above
        GetViewClass numbersArrayAdapter = new GetViewClass(this, arrayList);

        // create the instance of the ListView to set the numbersViewAdapter
        ListView numbersListView = findViewById(R.id.listView);

        // set the numbersViewAdapter for ListView
        numbersListView.setAdapter(numbersArrayAdapter);

    }
}