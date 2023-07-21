package com.college.cbit_clubs;



import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class homepage extends AppCompatActivity implements View.OnClickListener {

    GridLayout mainGrid;

    public CardView card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        card1=(CardView) findViewById(R.id.db1);
        card2=(CardView) findViewById(R.id.db2);
        card3=(CardView) findViewById(R.id.db3);
        card4=(CardView) findViewById(R.id.db4);
        card5=(CardView) findViewById(R.id.db5);
        card6=(CardView) findViewById(R.id.d6);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);


        }
        @Override
             public void onClick(View v){
                 Intent i;
                 switch (v.getId()){
                     case R.id.db1:
                         i=new Intent(this,samskruthi.class);
                         startActivity(i);
                         break;


                     case R.id.db2:
                         i=new Intent(this,seva.class);
                         startActivity(i);
                         break;

                     case R.id.db3:
                         i=new Intent(this,saahithi.class);
                         startActivity(i);
                         break;


                     case R.id.db4:
                         i=new Intent(this,chaaya.class);
                         startActivity(i);
                         break;


                     case R.id.db5:
                         i=new Intent(this,kreeda.class);
                         startActivity(i);
                         break;


                     case R.id.d6:
                         i=new Intent(this,smriti.class);
                         startActivity(i);
                         break;


                 }


    }
}