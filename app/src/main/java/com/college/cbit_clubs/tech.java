package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class tech extends AppCompatActivity implements View.OnClickListener {
    GridLayout mainGrid;
    public CardView card1,card2,card3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        mainGrid = (GridLayout) findViewById(R.id.mainGrids);

        card1=(CardView) findViewById(R.id.sudhee);
        card2=(CardView) findViewById(R.id.maths);
        card3=(CardView) findViewById(R.id.cosc);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.sudhee:
                i = new Intent(this, sudhee.class);
                startActivity(i);
                break;


            case R.id.maths:
                i = new Intent(this, maths.class);
                startActivity(i);
                break;

            case R.id.cosc:
                i = new Intent(this, cosc.class);
                startActivity(i);
                break;
        }

    }
}