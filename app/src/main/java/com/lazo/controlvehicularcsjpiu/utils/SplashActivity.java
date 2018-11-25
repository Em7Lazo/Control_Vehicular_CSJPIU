package com.lazo.controlvehicularcsjpiu.utils;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lazo.controlvehicularcsjpiu.MainActivity;
import com.lazo.controlvehicularcsjpiu.R;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
}
