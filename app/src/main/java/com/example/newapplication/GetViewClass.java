package com.example.newapplication;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GetViewClass extends ArrayAdapter<ViewClass>{
    public GetViewClass(@NonNull Context context, ArrayList<ViewClass> arrayList) {

        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View currentItemView = convertView;



        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ViewClass currentNumberPosition = getItem(position);

        ImageView numbersImage = currentItemView.findViewById(R.id.imageView);
        assert currentNumberPosition != null;
        numbersImage.setImageResource(currentNumberPosition.getNumbersImageId());

        TextView textView1 = currentItemView.findViewById(R.id.textView);
        textView1.setText(currentNumberPosition.getNumberInDigit());

        Button textView2 = currentItemView.findViewById(R.id.button);
        textView2.setText(currentNumberPosition.getNumbersInText());

        return currentItemView;
    }
}
