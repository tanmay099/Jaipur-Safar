package com.example.android.jaipursafari;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sanskrati extends Fragment {
    public Sanskrati() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);
        ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content("Art And Crafts", "skilled artists and craftsmen products", R.drawable.ameraofrtmaotalake ));
        contents.add(new Content("Performing Arts", "Tamasha, gharna for khata", R.drawable.hawamahel));
        contents.add(new Content("Cuisine", "sweets like Ghevar, Feeni, Gajak, Chauguni ke laddu, Moong Thal", R.drawable.cityplace));
        contents.add(new Content("Fairs And Festivals", " Jaipur Literature festival, Kite festival, Teej festival", R.drawable.jantermanter));
        contents.add(new Content("People and Languages", "wear colourful outfits, marwari, rajasthani", R.drawable.nahargarh));
        contents.add(new Content("The Goth of Dal Bati Churma", "special dish", R.drawable.images));
        contents.add(new Content("Donkey Festival", "popular fest", R.drawable.jaigarhfort));
        contents.add(new Content("Ladli Vocational Training Centre", "cahrity home", R.drawable.alberthallmuseum));
        contents.add(new Content("Camel ride", "traditonal camel ride", R.drawable.birlamandir));
        contents.add(new Content("polo sport", "sport played on sports", R.drawable.govindji));
        contents.add(new Content("pupet show", "show describing rajasthani culture", R.drawable.rambagh));
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.category_sanskrati);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}