package com.example.android.jaipursafari;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sony on 8/7/2016.
 */
public class SectionAdapter extends FragmentPagerAdapter {


    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link SectionAdapter} object.
     *
     * @param context is the context of the app
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public SectionAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HIstoricalPlaces();
        } else if (position == 1) {
            return new PointsOfIntrest();
        } else if (position == 2) {
            return new MordernEra();
        } else {
            return new Sanskrati();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_Historicalplaces);
        } else if (position == 1) {
            return mContext.getString(R.string.category_pointsofinterest);
        } else if (position == 2) {
            return mContext.getString(R.string.category_modernera);
        } else {
            return mContext.getString(R.string.category_sanskrati);
        }
}}
