package com.zimadev.brian.lab4localisationactivitylayoutsintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lab4 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geoMap(View view)
    {
        Uri uri = Uri.parse("geo:0,0?q=Canada");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(mapIntent);
    }
}
