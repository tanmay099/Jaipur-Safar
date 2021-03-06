package com.example.android.jaipursafari;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Locations[] items = {
                new Locations( "tonk road", "jaipur")};



        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        SectionAdapter adapter = new SectionAdapter(this, getSupportFragmentManager());
        // Create an adapter that knows which fragment should be shown on each page


        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);




        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
