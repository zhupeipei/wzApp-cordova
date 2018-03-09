package com.aire.android.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aire.android.utils.GlobalParamsUtil;

import io.cordova.hellocordova.MainActivity;
import io.cordova.hellocordova.R;

public class MainNativeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_native);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GlobalParamsUtil.getContext(), MainActivity.class);
                GlobalParamsUtil.getContext().startActivity(intent);
            }
        });
    }
}
