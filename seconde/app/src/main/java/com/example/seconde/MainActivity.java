package com.example.seconde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    private Button buttonView;
    private Button exitText;
    private Button radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this, textView.class);
            startActivity(intent);
//                view.
        });
        buttonView = findViewById(R.id.buttonView);
        buttonView.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this, com.example.seconde.Button.class);
            startActivity(intent);
        });


        exitText = findViewById(R.id.exitText);
        exitText.setOnClickListener((view)->{
            Intent intent = new Intent(MainActivity.this, EditText.class);
            startActivity(intent);
        });
        radio = findViewById(R.id.radio);
        radio.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity.this, Radio.class);
            startActivity(intent);
        }));


    }
}
