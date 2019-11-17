package com.example.seconde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radio extends AppCompatActivity {

    private RadioGroup g1_r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        g1_r1 = findViewById(R.id.RadioGroup1);
        g1_r1.setOnCheckedChangeListener((g1,r1)->{
            RadioButton radioButton  = g1.findViewById(r1);
            Toast.makeText(Radio.this,radioButton.getText() , Toast.LENGTH_SHORT).show();
        });

    }
}
