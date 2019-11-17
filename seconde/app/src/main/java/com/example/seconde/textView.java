package com.example.seconde;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class textView extends AppCompatActivity {
    private TextView mdLine;
    private TextView underLine;
    private TextView runAlways;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        mdLine = findViewById(R.id.middleLine);
        mdLine.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mdLine.getPaint().setAntiAlias(true);//去除锯齿

        underLine = findViewById(R.id.underLine);
        underLine.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        runAlways = findViewById(R.id.runAlways);
        runAlways.setSelected(true);

    }

    public void haveDel(View view) {
        Toast.makeText(this, "我本删除", Toast.LENGTH_SHORT).show();
    }
}
