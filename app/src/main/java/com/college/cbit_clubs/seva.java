package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class seva extends AppCompatActivity implements View.OnClickListener {


    GridLayout mainGrid;

    public CardView card1,card2,card3,card4,card5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva);

        mainGrid = (GridLayout) findViewById(R.id.mainGridse);

        card1=(CardView) findViewById(R.id.sec1);
        card2=(CardView) findViewById(R.id.sec2);
        card3=(CardView) findViewById(R.id.sec3);
        card4=(CardView) findViewById(R.id.sec4);
        card5=(CardView) findViewById(R.id.sec5);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.sec1:
                i = new Intent(this, nss.class);
                startActivity(i);
                break;


            case R.id.sec2:
                i = new Intent(this, ncc.class);
                startActivity(i);
                break;

            case R.id.sec3:
                i = new Intent(this, parivritha.class);
                startActivity(i);
                break;


            case R.id.sec4:
                i = new Intent(this, streetcause.class);
                startActivity(i);
                break;


            case R.id.sec5:
                i = new Intent(this, ewb.class);
                startActivity(i);
                break;

        }



    }
}