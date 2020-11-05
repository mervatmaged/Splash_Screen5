package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {

    long a = 6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Timer runSplash= new Timer();
        TimerTask showSplash =new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent =new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(intent);
            }
        };
        runSplash.schedule(showSplash,a);
    }

}