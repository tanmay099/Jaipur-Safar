package com.example.android.jaipursafari;

/**
 * Created by sony on 8/7/2016.
 */
public class Content {
    private  String mPlaceTitle;
    private String mPlaceDescription;
    private int mImageResourseId;



public Content(String PlaceTitle, String PlaceDescription,int ImageResourseId){
    mPlaceTitle= PlaceTitle;
    mPlaceDescription = PlaceDescription;
    this.mImageResourseId = ImageResourseId;
    }
    public String getmPlaceTitle() {
        return mPlaceTitle;
    }
    public String getmPlaceDescription() {
        return mPlaceDescription;
    }
    public int getmImageResourseId(){
        return mImageResourseId;
    }
}
