package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class logout extends AppCompatActivity {

    Button btnout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        btnout = findViewById(R.id.btnout);


       btnout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(logout.this, "You are logged out", Toast.LENGTH_SHORT).show();

               Intent intent = new Intent(logout.this, MainActivity.class);
               startActivity(intent);
           }
       });


    }
}