package com.college.cbit_clubs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class signin extends AppCompatActivity {

    EditText Username, Rollnumber, phonenumber, email, password;
    Button btnregister;


    TextView tvlogin;
    FirebaseAuth mFirebaseAuth;
    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;

   public FirebaseDatabase db=FirebaseDatabase.getInstance();
    DatabaseReference root=db.getReference().child("Users");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        getSupportActionBar().setTitle("REGISTER");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Username = findViewById(R.id.editTextTextPersonName);
        Rollnumber = findViewById(R.id.editTextNumber);
        phonenumber = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        btnregister = findViewById(R.id.btnregister);
        

        tvlogin = findViewById(R.id.tvlogin);


        mFirebaseAuth = FirebaseAuth.getInstance();
         /*firebaseDatabase db= FirebaseDatabase.getInstance();
        DatabaseReference root=db.getReference().child("Users");*/


        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Uname = Username.getText().toString();
                String Rnumber = Rollnumber.getText().toString();
                String Pnumber = phonenumber.getText().toString();
                String mail = email.getText().toString();
                String pwd = password.getText().toString();
                HashMap<String,String> userMap=new HashMap<>();
                userMap.put("Username",Uname);
                userMap.put("Rollnumber",Rnumber);
                userMap.put("Phonenumber",Pnumber);
                userMap.put("email",mail);
                userMap.put("password",pwd);

                root.push().setValue(userMap);



                if (Uname.isEmpty()) {
                    Username.setError("Please provide username");
                    Username.requestFocus();

                } else if (Rnumber.isEmpty()) {
                    Rollnumber.setError("please provide rollnumber");
                    Rollnumber.requestFocus();
                } else if (Pnumber.isEmpty()) {
                    phonenumber.setError("please provide phonenumber");
                    phonenumber.requestFocus();
                } else if (mail.isEmpty()) {
                    email.setError("please provide email id");
                    email.requestFocus();
                } else if (pwd.isEmpty()) {
                    password.setError("please provide password");
                    password.requestFocus();
                } else if (mail.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(signin.this, "fields are empty", Toast.LENGTH_SHORT).show();

                } else if (!(mail.isEmpty() && pwd.isEmpty())) {
                    mFirebaseAuth.createUserWithEmailAndPassword(mail, pwd)
                            .addOnCompleteListener(signin.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {

                                    if (!task.isSuccessful()) {


                                       // userDetail Userdetail= new userDetail(0);
                                        Toast.makeText(signin.this, "Register unsuccessful, try again", Toast.LENGTH_SHORT).show();

                                    } else {

                                        startActivity(new Intent(signin.this, open.class));
                                    }
                                }
                            });
                } else {
                    Toast.makeText(signin.this, "Registered failed", Toast.LENGTH_SHORT).show();
                }
            }
                                       }
        );

        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intlogin = new Intent(signin.this, Login.class);
                intlogin.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intlogin);
            }
        });
    }


    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();

    }
}