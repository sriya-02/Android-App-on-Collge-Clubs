package com.college.cbit_clubs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class addevent extends AppCompatActivity {

    private EditText Ename,Evenue,Edate,Etime,EDesc;
    private Button btnadd;
    private FirebaseFirestore db;
    private CollectionReference dbDocuments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addevent);
        Ename=findViewById(R.id.editevent);
        Evenue=findViewById(R.id.editvenue);
        Edate=findViewById(R.id.editTextDate);
        Etime=findViewById(R.id.editTextTime);
        EDesc=findViewById(R.id.editTextTextMultiLine);
        btnadd=findViewById(R.id.btnregisterevent);
        db=FirebaseFirestore.getInstance();
        
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eventname=Ename.getText().toString();
                String venue=Evenue.getText().toString();
                String date=Edate.getText().toString();
                String time=Etime.getText().toString();
                String description=EDesc.getText().toString();
                String id= UUID.randomUUID().toString();
                
                saveToFireStore(id,eventname,venue,date,time,description);
            }
        });
    }

    private void saveToFireStore(String id, String eventname, String venue, String date,String Time, String description) {

        /*if (!eventname.isEmpty()&&!description.isEmpty())
        {
            HashMap<String,Object> map=new HashMap<>();
            map.put("id",id);
            map.put("Eventname",eventname);
            map.put("Venue",venue);
            map.put("Date",date);
            map.put("Description",description);
            db.collection("Documents").document(id).set(map)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(addevent.this,"Data saved!!",Toast.LENGTH_SHORT).show();
                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(addevent.this,"Failed!!",Toast.LENGTH_SHORT).show();
                }
            });
        }else
            Toast.makeText(addevent.this,"Empty fields",Toast.LENGTH_SHORT).show();*/


        CollectionReference dbDocuments=db.collection("Documents");
        Model model=new Model(eventname,venue,date,Time,description);
        dbDocuments.add(model).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Toast.makeText(addevent.this,"Event added",Toast.LENGTH_SHORT).show();
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(addevent.this,"Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}