package com.aaxena.spandansaxena_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Landing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeName();
    }

    public void changeName() {
        TextView devName = findViewById(R.id.devName);
        Button changeName = findViewById(R.id.changeName);
        String spandan = devName.getText().toString();

        changeName.setOnClickListener(v -> {
            Toast.makeText(Landing.this, "Developed by Spandan Saxena :)", Toast.LENGTH_SHORT).show();
            changeName.setText(spandan);
        });
    }
}