package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void segitiga(View view) {
        Intent intent = new Intent(MainActivity.this, second.class);
        startActivity(intent);
    }
    public void jajargenjang(View view) {
        Intent Jintent = new Intent(MainActivity.this, third.class);
        startActivity(Jintent);
    }
}