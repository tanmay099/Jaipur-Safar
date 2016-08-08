package com.example.android.jaipursafari;

import android.location.Location;

/**
 * Created by sony on 8/7/2016.
 */
public class Content {
    private  String mPlaceTitle;
    private String mPlaceDescription;
    private int mImageResourceId;
    private String mLocations;



public Content(String PlaceTitle, String PlaceDescription, int ImageResourceId){
    mPlaceTitle= PlaceTitle;
    mPlaceDescription = PlaceDescription;
    mImageResourceId = ImageResourceId;

}
    public String getmPlaceTitle() {
        return mPlaceTitle;
    }
    public String getmPlaceDescription() {
        return mPlaceDescription;
    }
    public int getmImageResourceId(){
        return mImageResourceId;
    }

}
