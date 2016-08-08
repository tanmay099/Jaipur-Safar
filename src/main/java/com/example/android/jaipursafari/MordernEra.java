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
public class MordernEra extends Fragment {
    public MordernEra() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);
        ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content("Peacock roof top restourent", "North indian, chinese,continental", R.drawable.ameraofrtmaotalake));
        contents.add(new Content("blackout", "North indian, european, continental", R.drawable.hawamahel));
        contents.add(new Content("On the bar B-Q", "Casual dining", R.drawable.cityplace));
        contents.add(new Content("F bar and lounge golden tulip", "north indian, chinese, continental", R.drawable.jantermanter));
        contents.add(new Content("100% Rock", "continental, thai, chinese", R.drawable.nahargarh));
        contents.add(new Content("Peshware ITC rajputana hotal", "North indian", R.drawable.images));
        contents.add(new Content("Sodhani sweets", "street food", R.drawable.jaigarhfort));
        contents.add(new Content("Cycling Tour of Pink City, Rajasthan", "tour the places via bycycle", R.drawable.alberthallmuseum));
        contents.add(new Content("Day Trip to Samode in Rajasthan", "view the desert on camel ride", R.drawable.birlamandir));
        contents.add(new Content("the foresta kitchen and bar", "continental, north indian, chinese, ice cream", R.drawable.govindji));
        contents.add(new Content("Nibs cafe", "cafe italian ,continental", R.drawable.rambagh));
        contents.add(new Content("Barbque Nation", "north indain, chinese ,continental", R.drawable.rambagh));
        ContentAdapter adapter = new ContentAdapter(getActivity(), contents, R.color.section_modern);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
