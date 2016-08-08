package com.example.android.jaipursafari;

import android.content.res.Resources;
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
public class PointsOfIntrest extends Fragment {
    public PointsOfIntrest() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



    View rootView = inflater.inflate(R.layout.content_list, container, false);

    ArrayList<Content> contents= new ArrayList<Content>();
    contents.add(new Content("popular Day trips to take in Jaipur","enjouy to historical beauty in sunny" ,R.drawable.ameraofrtmaotalake ));
    contents.add(new Content("Visits to the Forts of Jaipur","All fort tour in one ", R.drawable.hawamahel));
    contents.add(new Content("Cultural Tour of Jaipur", "fascinating tour of the Pink City",R.drawable.cityplace));
    contents.add(new Content("Heritage Haveli Tour in Jaipur","most culturally rich state.",R.drawable.jantermanter));
    contents.add(new Content("Jaipur Sightseeing Trip","visit and explore te pink city",R.drawable.nahargarh));
    contents.add(new Content("City Tour by Rickshaw in Jaipur","explore city on rikshaw cycle",R.drawable.images));
    contents.add(new Content("Antique Walking in Jaipur","walking tour of Jaipur",R.drawable.jaigarhfort));
    contents.add(new Content("Cycling Tour of Pink City, Rajasthan","tour the places via bycycle",R.drawable.alberthallmuseum));
    contents.add(new Content("Day Trip to Samode in Rajasthan", "view the desert on camel ride",R.drawable.birlamandir));
    contents.add(new Content("Bazaars of Jaipur","experience the vibes of the Pink City",R.drawable.govindji));
    contents.add(new Content("Rambagh Palace","Residence of Maharaja of jaipur",R.drawable.rambagh));

    ContentAdapter adapter = new ContentAdapter(getActivity(),contents,R.color.section_point);

    ListView listView = (ListView) rootView.findViewById(R.id.list);


    listView.setAdapter(adapter);





    return rootView;
}}

