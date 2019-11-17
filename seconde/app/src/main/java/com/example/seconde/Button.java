package com.example.seconde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Button extends AppCompatActivity {
    private android.widget.Button byJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        byJava = findViewById(R.id.byJava);
        byJava.setOnClickListener((view)->{
            Toast.makeText(this,"java click",Toast.LENGTH_LONG).show();
        });

    }

    public void clickFor(View view) {
        Toast.makeText(this,"xml  click",Toast.LENGTH_LONG).show();
    }
}
