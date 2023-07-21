package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class chaaya extends AppCompatActivity implements View.OnClickListener {


    GridLayout mainGrid;
    public CardView card1,card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaaya);

        mainGrid = (GridLayout) findViewById(R.id.mainGridcha);

        card1=(CardView) findViewById(R.id.chac1);
        card2=(CardView) findViewById(R.id.chac2);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.chac1:
                i = new Intent(this, filmmaking.class);
                startActivity(i);
                break;


            case R.id.chac2:
                i = new Intent(this, photography.class);
                startActivity(i);
                break;


        }
    }
}