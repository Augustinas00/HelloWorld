package com.example.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.myTextView);
        Button btn = findViewById(R.id.myButton);

        btn.setOnClickListener(v -> {
            tv.setText("Labas!");
        });

        Button colorBtn = findViewById(R.id.colorButton);

        colorBtn.setOnClickListener(v -> {
            tv.setTextColor(android.graphics.Color.RED);
        });
    }
}