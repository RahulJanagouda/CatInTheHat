package com.janagouda.rahul.catinthehat;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);

        toolbar.setBackgroundColor(getResources().getColor(R.color.primary_dark));
        toolbar.setLogo(getResources().getDrawable(R.mipmap.ic_launcher));

        findViewById(R.id.the_cat_button).setOnClickListener(this);
        findViewById(R.id.thing_one_button).setOnClickListener(this);
        findViewById(R.id.thing_two_button).setOnClickListener(this);
        findViewById(R.id.thingmajigger_button).setOnClickListener(this);
        findViewById(R.id.sally_button).setOnClickListener(this);
        findViewById(R.id.nick_button).setOnClickListener(this);
        findViewById(R.id.dr_seuss_button).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String toastMessage = "";
        switch (v.getId()){
            case R.id.the_cat_button:
                toastMessage+="Can I has the poland?";
                break;
            case R.id.thing_one_button:
                toastMessage+="Numero Uno";
                break;
            case R.id.thing_two_button:
                toastMessage+="Gotta do a number two";
                break;
            case R.id.thingmajigger_button:
                toastMessage+="Are you a wizard??";
                break;
            case R.id.sally_button:
                toastMessage+="You see? That is just like you, Harry. You say things like that, and you make it impossible for me to hate you.";
                break;
            case R.id.nick_button:
                toastMessage+="“If you can't get a miracle, become one.― Nick Vujicic";
                break;
            case R.id.dr_seuss_button:
                toastMessage+="Don't cry because it's over, smile because it happened.― Dr. Seuss";
                break;
        }
        Toast.makeText(this,toastMessage,Toast.LENGTH_SHORT).show();
    }
}
