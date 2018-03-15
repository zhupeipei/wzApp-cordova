package com.aire.android.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewImpl;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;

import io.cordova.hellocordova.R;

public class ExternalWebsiteCordovaActivity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_website_cordova);

        // enable Cordova apps to be started in the background
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        Intent intent = getIntent();

        // Set by <content src="index.html" /> in config.xml
        loadUrl(intent.getStringExtra("externalUrl"));
    }

    @Override
    protected void createViews() {
        if (preferences.contains("BackgroundColor")) {
            int backgroundColor = preferences.getInteger("BackgroundColor", Color.BLACK);
            // Background of activity:
            appView.getView().setBackgroundColor(backgroundColor);
        }

        appView.getView().requestFocusFromTouch();
    }

    @Override
    protected CordovaWebView makeWebView() {
        SystemWebView webView = (SystemWebView) findViewById(R.id.cordovaWebView);
        return new CordovaWebViewImpl(new SystemWebViewEngine(webView));
    }

}
