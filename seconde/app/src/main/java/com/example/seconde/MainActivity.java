package com.example.seconde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        jump();


    }

    private void jump() {
        submitButton = findViewById(R.id.submitButton);
        setRemove(submitButton, textView.class);

        buttonView = findViewById(R.id.buttonView);
        setRemove(buttonView, com.example.seconde.Button.class);


        exitText = findViewById(R.id.exitText);
        setRemove(exitText, EditText.class);

        radio = findViewById(R.id.radio);
        setRemove(radio, Radio.class);
    }

    private void setRemove(View view ,Class classa) {
        view.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity.this, classa);
            startActivity(intent);
        }));
    }
}
