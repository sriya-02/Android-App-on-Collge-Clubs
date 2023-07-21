package com.college.cbit_clubs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    EditText email,password;
    Button btnlogin2,btnadmin;
    TextView tvsignup;
    FirebaseAuth firebaseAuth;
    FirebaseDatabase firebaseDatabase;

    private FirebaseAuth.AuthStateListener mAuthStateListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*getSupportActionBar().setTitle("LOGIN");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/

        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        btnlogin2 = findViewById(R.id.btnlogin2);
        tvsignup = findViewById(R.id.textViewsignup);

        firebaseDatabase = firebaseDatabase.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = firebaseAuth.getCurrentUser();
                if (mFirebaseUser != null) {
                    Toast.makeText(Login.this, "You are logged in", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(Login.this, open.class);
                    startActivity(i);

                } else {
                    Toast.makeText(Login.this, "Please login", Toast.LENGTH_SHORT).show();
                }
            }
        };

        btnlogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = email.getText().toString();
                String pwd = password.getText().toString();

                if (mail.isEmpty()) {
                    email.setError("Please provide email");
                    email.requestFocus();

                } else if (pwd.isEmpty()) {
                    password.setError("Please provide password");
                    password.requestFocus();

                } else if (mail.isEmpty() && pwd.isEmpty()) {
                    Toast.makeText(Login.this, "Fields are Empty", Toast.LENGTH_SHORT).show();


                } else if (!(mail.isEmpty() && pwd.isEmpty())) {
                    firebaseAuth.signInWithEmailAndPassword(mail, pwd)
                            .addOnCompleteListener(Login.this,
                                    new OnCompleteListener<AuthResult>() {
                                        @Override
                                        public void onComplete(@NonNull Task<AuthResult> task) {
                                            if (!task.isSuccessful()) {
                                                Toast.makeText(Login.this, "Login error", Toast.LENGTH_SHORT).show();
                                            }else{
                                                Log.e("test",firebaseAuth.getCurrentUser().getEmail());
                                                String s="admin@gmail.com";
                                                if(firebaseAuth.getCurrentUser().getEmail().equals(s)) {
                                                    Log.e("test1",mail);
                                                    Intent inttodash = new Intent(Login.this, admin.class);
                                                    startActivity(inttodash);}
                                                else {
                                                    Intent inttodash = new Intent(Login.this, open.class);
                                                    startActivity(inttodash);
                                                    Log.e("test2",mail);
                                                }
                                            }
                                        }
                                    });

                } else {
                    Toast.makeText(Login.this, "error", Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*btnadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, admin.class);
                startActivity(i);
            }
        });*/
        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login.this, signin.class);
                startActivity(in);
            }
        });
    }







/* @Override
    protected void onStart(){
        super.onStart();
        firebaseAuth.addAuthStateListener(mAuthStateListener);
    }*/

}



