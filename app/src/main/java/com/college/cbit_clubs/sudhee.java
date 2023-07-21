package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sudhee extends AppCompatActivity {
    Button cse;
    Button it;
    Button civil;
    Button eee;
    Button robo;
    Button mech;
    Button ece;
    Button bio;
    Button chem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudhee);

        cse=findViewById(R.id.cse);
        it=findViewById(R.id.it);
        civil=findViewById(R.id.civil);
        eee=findViewById(R.id.eee);
        robo=findViewById(R.id.robo);
        mech=findViewById(R.id.mech);
        ece=findViewById(R.id.ece);
        bio=findViewById(R.id.bio);
        chem=findViewById(R.id.chem);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("http://civilizations.cbit.org.in/");
            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("http://tecstasy.cbit.org.in/");
            }
        });
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://neozion.cbit.org.in");
            }
        });
        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl(" www.chemspark2021.in");
            }
        });
        robo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://robovanza2k21.github.io/Robovanza/");
            }
        });







    }

    private void gotourl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}