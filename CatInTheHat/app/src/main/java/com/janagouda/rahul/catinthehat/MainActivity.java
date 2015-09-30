/*
 * Copyright (c) 2015. Rahul Janagouda
 */

package com.janagouda.rahul.catinthehat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


/**
 * The type Main activity.
 */
public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);

        toolbar.setBackgroundColor(getResources().getColor(R.color.primary_dark));
        toolbar.setLogo(getResources().getDrawable(R.mipmap.ic_launcher));

        findViewById(R.id.spotify_streamer_button).setOnClickListener(this);
        findViewById(R.id.scores_app_button).setOnClickListener(this);
        findViewById(R.id.library_app_button).setOnClickListener(this);
        findViewById(R.id.build_it_bigger_button).setOnClickListener(this);
        findViewById(R.id.xyz_reader_button).setOnClickListener(this);
        findViewById(R.id.capstone_button).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String toastMessage = "It launches ";
        switch (v.getId()){
            case R.id.spotify_streamer_button:
                toastMessage += "Spotify Streamer App";
                break;
            case R.id.scores_app_button:
                toastMessage += "Scores App";
                break;
            case R.id.library_app_button:
                toastMessage += "Library App";
                break;
            case R.id.build_it_bigger_button:
                toastMessage += "“Build it bigger App";
                break;
            case R.id.xyz_reader_button:
                toastMessage += "XYZ Reader";
                break;
            case R.id.capstone_button:
                toastMessage += "Capstone";
                break;
            default:
                toastMessage += "Nothing";
                break;
        }
        Toast.makeText(this,toastMessage,Toast.LENGTH_SHORT).show();
    }
}
