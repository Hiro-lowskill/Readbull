package com.example.readbull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class conkyrs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conkyrs);
    }
    public void btn1(View view) {
        Intent i = new Intent(this, panel.class);
        startActivity(i);
        finish();
    }
}
