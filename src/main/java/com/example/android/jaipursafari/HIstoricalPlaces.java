package com.example.android.jaipursafari;

import android.content.ClipData;
import android.location.Location;
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
public class HIstoricalPlaces extends Fragment {
    public HIstoricalPlaces() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);
        ArrayList<Locations> locations = new ArrayList<Locations>();


        ArrayList<Content> contents= new ArrayList<Content>();
        contents.add(new Content("Amer Fort","16th century hiltop fort& palace" ,R.drawable.ameraofrtmaotalake));
        contents.add(new Content("Hawa Mahal","fairy-tale, pink sandstone", R.drawable.hawamahel));
        contents.add(new Content("City Palace", "includes the Chandra Mahal and Mubarak Mahal palaces",R.drawable.cityplace));
        contents.add(new Content("Jantar Mantar","astronomical observation site",R.drawable.jantermanter));
        contents.add(new Content("Nahargarh Fort","stands on the edge of the Aravalli Hills",R.drawable.nahargarh));
        contents.add(new Content("Jal Mahal","palace located in the middle of the Man Sagar Lake",R.drawable.images));
        contents.add(new Content("Jaigarh Fort","situated on the promontory called the Cheel ka Teela",R.drawable.jaigarhfort));
        contents.add(new Content("Albert Hall Museum","oldest museum of the state",R.drawable.alberthallmuseum));
        contents.add(new Content("Birla Mandir", "Mordern hindu temple mae up of marbels",R.drawable.birlamandir));
        contents.add(new Content("Govind Dev Ji Templ","Hindu temple Govind Dev Ji",R.drawable.govindji));
        contents.add(new Content("Rambagh Palace","Residence of Maharaja of jaipur",R.drawable.rambagh));
        contents.add(new Content("Raj Mandir Cinema","cinema hall that will cross the boundary of traditional cinema",R.drawable.rajmandircinema));
        contents.add(new Content("Sawai Mansingh Stadium","Criket Ground",R.drawable.sms));
        contents.add(new Content("Jaipur Zoo","animal kingdom",R.drawable.jaipurzoo));
        locations.add(new Locations("tonk road", "jaipur"));

        ContentAdapter adapter = new ContentAdapter(getActivity(),contents,R.color.section_historical);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);





        return rootView;
}}
