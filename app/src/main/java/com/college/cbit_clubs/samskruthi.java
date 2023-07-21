package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class samskruthi extends AppCompatActivity implements View.OnClickListener {


    GridLayout mainGrid;
    public CardView card1,card2,card3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samskruthi);

        mainGrid = (GridLayout) findViewById(R.id.mainGridsm);

        card1=(CardView) findViewById(R.id.samc1);
        card2=(CardView) findViewById(R.id.samc2);
        card3=(CardView) findViewById(R.id.samc3);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.samc1:
                i = new Intent(this, MainActivity2.class);
                startActivity(i);
                break;


            case R.id.samc2:
                i = new Intent(this, vaadhya.class);
                startActivity(i);
                break;

            case R.id.samc3:
                i = new Intent(this, nritrya.class);
                startActivity(i);
                break;
        }


        }
}