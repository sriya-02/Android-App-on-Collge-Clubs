package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   Button btnlogin;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnlogin = findViewById(R.id.btnlogin);
       btnregister = findViewById(R.id.btnregister);

       btnlogin.setOnClickListener (new View.OnClickListener()

    {


        public void onClick(View view) {

            {

                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);

            }
        }   } );
        btnregister.setOnClickListener(new  View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Register has been clicked", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, signin.class);
                startActivity(intent);


            }
        });
    }}