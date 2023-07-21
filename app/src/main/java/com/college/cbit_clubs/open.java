package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class open extends AppCompatActivity implements View.OnClickListener{


    GridLayout mainGrid;

    public CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        card1=(CardView) findViewById(R.id.db1);
        card2=(CardView) findViewById(R.id.db2);
        card3=(CardView) findViewById(R.id.db3);
        card4=(CardView) findViewById(R.id.db4);


        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);


    }
    

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.db1:
                i = new Intent(this, adding.class);
                startActivity(i);
                break;


            case R.id.db2:
                i = new Intent(this, account.class);
                startActivity(i);
                break;

            case R.id.db3:
                i = new Intent(this, myclubs.class);
                startActivity(i);
                break;


            case R.id.db4:
                i = new Intent(this, aboutuss.class);
                startActivity(i);
                break;





        }


    }
}