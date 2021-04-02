package com.example.readbull.data;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.readbull.R;
import com.example.readbull.favorit;

@SuppressLint("Registered")
public class book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
    }

    public void btn1(View view) {
        Intent i = new Intent(this, favorit.class);
        startActivity(i);
        finish();
    }
}