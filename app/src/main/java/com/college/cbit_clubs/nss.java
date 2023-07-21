package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nss extends AppCompatActivity {

    Button btnnevent;
    Button btnnlink;
    Button btnnss;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nss);


        btnnevent=findViewById(R.id.btnevent);
        btnnlink=findViewById(R.id.btnglink);
        btnnss=findViewById(R.id.btn_geethi);
        btnnevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nss.this, showActivity.class);
                startActivity(intent);
            }
        });


        btnnlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nss.this,reclink .class);
                startActivity(intent);
            }
        });


        btnnss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nss.this,aboutnss.class);
                startActivity(intent);
            }
        });
    }

    }
