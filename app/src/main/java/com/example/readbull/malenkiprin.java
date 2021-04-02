package com.example.readbull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class malenkiprin extends AppCompatActivity {

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
