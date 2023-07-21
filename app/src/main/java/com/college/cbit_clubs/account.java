package com.college.cbit_clubs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

public class account extends AppCompatActivity {
    private TextView Auname,Arnumber,Aemail;
    private Button btnupdate;
    private Button btnlogout;


     private FirebaseAuth firebaseAuth;
    private FirebaseDatabase firebaseDatabase;
    DatabaseReference myref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        Auname=findViewById(R.id.tvun);
        Arnumber=findViewById(R.id.tvrn);
        Aemail=findViewById(R.id.tvemail);
        btnupdate=findViewById(R.id.btnupdate);
        btnlogout=findViewById(R.id.btnlogout);

        // firebaseAuth=FirebaseAuth.getInstance();
        //firebaseDatabase=FirebaseDatabase.getInstance();
        myref=FirebaseDatabase.getInstance().getReference().child("Users");
       // DatabaseReference databaseReference=firebaseDatabase.getReference(firebaseAuth.getUid());

        final ValueEventListener valueEventListener = myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                String Username = datasnapshot.child("Username").getValue().toString();
                String Rollnumber = datasnapshot.child("Rollnumber").getValue().toString();
                String email = datasnapshot.child("email").getValue().toString();
                Auname.setText(Username);
                Arnumber.setText(Rollnumber);
                Aemail.setText(email);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }


        });
        btnlogout.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(account.this, logout.class);
                startActivity(intent);
            }
        });

    }
}