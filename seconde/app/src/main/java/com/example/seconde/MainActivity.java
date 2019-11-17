package com.example.seconde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seconde.ListView.ListView;

public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    private Button buttonView;
    private Button exitText;
    private Button radio;
    private Button checkbox;
    private Button imageView;
    private Button listView;

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

        checkbox = findViewById(R.id.checkbox);
        setRemove(checkbox, CheckBOx.class);

        imageView = findViewById(R.id.imageView);
        setRemove(imageView, ImageView.class);

        listView = findViewById(R.id.listView);
        setRemove(listView, ListView.class);
    }

    private void setRemove(View view ,Class classa) {
        view.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity.this, classa);
            startActivity(intent);
        }));
    }
}
