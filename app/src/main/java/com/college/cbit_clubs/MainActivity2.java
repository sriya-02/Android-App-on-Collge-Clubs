package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity2 extends AppCompatActivity {

    Button btnevent;
    Button btnglink;
    Button btn_geethi;
    FirebaseFirestore db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geethi);
        btnevent=findViewById(R.id.btnevent);
        btnglink=findViewById(R.id.btnglink);
        btn_geethi=findViewById(R.id.btn_geethi);
        btnevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,showActivity.class);
                startActivity(intent);
            }
        });
        btnglink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,reclink .class);
                startActivity(intent);
            }
        });
        btn_geethi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,aboutgeethi.class);
                startActivity(intent);
            }
        });
    }
}