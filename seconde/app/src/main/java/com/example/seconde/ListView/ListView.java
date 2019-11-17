package com.example.seconde.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.seconde.R;

public class ListView extends AppCompatActivity {

    private android.widget.ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.lv1);
        listView.setAdapter(new MyAdapter(this));

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(ListView.this,"index"+position,Toast.LENGTH_SHORT).show();
           }
       });

       listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
           @Override
           public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(ListView.this,"long index"+position,Toast.LENGTH_SHORT).show();
               return true;
           }
       });
    }
}
