package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adding extends AppCompatActivity {
    Button btntech;
    Button btnnontech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);

        btnnontech=findViewById(R.id.btnnontech);
        btntech=findViewById(R.id.btntech);

        btnnontech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(adding.this, homepage.class);
                startActivity(intent);
            }
        });
        btntech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(adding.this,tech.class);
                startActivity(i);
            }
        });

    }
}