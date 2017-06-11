package com.example.sheda.risk;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by Daniel on 6/10/2017.
 */

public class PopUpWindow extends Activity{ //FOR THE COUNTRY NOT THE USER
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.country_popup);

        DisplayMetrics Dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(Dm);

        int width = Dm.widthPixels;
        int height = Dm.heightPixels;

        getWindow().setLayout((int)(width * 0.8),(int)(height * 0.8));

    }
}
