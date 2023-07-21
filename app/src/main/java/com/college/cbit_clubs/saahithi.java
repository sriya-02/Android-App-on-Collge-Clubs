package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class saahithi extends AppCompatActivity implements View.OnClickListener {


    GridLayout mainGrid;

    public CardView card1,card2,card3,card4,card5,card6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saahithi);

        mainGrid = (GridLayout) findViewById(R.id.mainGridsaa);

        card1=(CardView) findViewById(R.id.saac1);
        card2=(CardView) findViewById(R.id.saac2);
        card3=(CardView) findViewById(R.id.saac3);
        card4=(CardView) findViewById(R.id.saac4);
        card5=(CardView) findViewById(R.id.saac5);
        card6=(CardView) findViewById(R.id.saac6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.saac1:
                i=new Intent(this,literati.class);
                startActivity(i);
                break;


            case R.id.saac2:
                i=new Intent(this,newsletter.class);
                startActivity(i);
                break;

            case R.id.saac3:
                i=new Intent(this,communicando.class);
                startActivity(i);
                break;


            case R.id.saac4:
                i=new Intent(this,mun.class);
                startActivity(i);
                break;


            case R.id.saac5:
                i=new Intent(this,toastmasters.class);
                startActivity(i);
                break;


            case R.id.saac6:
                i=new Intent(this,transcendent.class);
                startActivity(i);
                break;


        }
    }
}