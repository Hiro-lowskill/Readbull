package com.example.readbull;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

@SuppressLint("Registered")
public class me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
    }
    public void btn1(View view) {
        Intent i = new Intent(this, panel.class);
        startActivity(i);
        finish();
    }
}
