package com.example.android.jaipursafari;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sony on 8/7/2016.
 */
public class ContentAdapter extends ArrayAdapter<Content> {
    private int mColorResourceId;

    public ContentAdapter(Activity context, ArrayList<Content> contents, int colorResourceId ) {
        super(context, 0, contents);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Content currentContent = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.text1);
        // Get the version name from the current  object and
        // set this text on the name TextView
        titleTextView.setText(currentContent.getmPlaceTitle());
        // Find the TextView in the list_item.xml layout with the ID
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text2);


        defaultTextView.setText(currentContent.getmPlaceDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.ic_launcher);

        imageView.setImageResource(currentContent.getmImageResourseId());


        View textContainer = listItemView.findViewById(R.id.text_container);


        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}