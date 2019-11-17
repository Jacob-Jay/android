package com.example.seconde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class EditText extends AppCompatActivity {

    private android.widget.EditText userName;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        userName = findViewById(R.id.userName);
        userName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edisxtex", s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        login = findViewById(R.id.login);
        login.setOnClickListener((view)->{
            Toast.makeText(EditText.this,"loggin success",Toast.LENGTH_SHORT).show();
        });
    }
}
