package com.example.readbull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.readbull.ui.login.LoginActivity;


public class MainActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 1200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainintent = new Intent(MainActivity.this, glavni.class);
                MainActivity.this.startActivity(mainintent);
                MainActivity.this.finish();

            }
        }, SPLASH_DISPLAY_LENGHT);
    }
    public void onBackPressed(){super.onBackPressed();}
}
