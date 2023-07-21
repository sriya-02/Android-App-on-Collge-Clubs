package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class registerevent extends AppCompatActivity {
    Button btnregisterevent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerevent);


        btnregisterevent=findViewById(R.id.btnregisterevent);


        btnregisterevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(registerevent.this, "Registered!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}