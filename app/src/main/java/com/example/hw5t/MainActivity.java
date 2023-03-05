package com.example.hw5t;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button button = findViewById(R.id.game_btn);

        button.setOnClickListener(v ->  {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
        });
    }
}