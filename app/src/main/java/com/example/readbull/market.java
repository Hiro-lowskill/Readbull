package com.example.animu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class market extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
    }
    public void btn1(View view) {
        Intent i = new Intent(this, glavni.class);
        startActivity(i);
        finish();
    }
    public void btn2(View view) {
        Intent i = new Intent(this, market.class);
        startActivity(i);
        finish();
    }
    public void btn3(View view) {
        Intent i = new Intent(this, my.class);
        startActivity(i);
        finish();
    }
    public void btn4(View view) {
        Intent i = new Intent(this, favorit.class);
        startActivity(i);
        finish();
    }
    public void btn5(View view) {
        Intent i = new Intent(this, money.class);
        startActivity(i);
        finish();
    }
}
