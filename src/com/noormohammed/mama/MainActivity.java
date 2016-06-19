package com.noormohammed.mama;

import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends DroidGap {

    @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        super.loadUrl(Config.getStartUrl());
    }


    
}
