package com.college.cbit_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;




import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
        import com.google.firebase.firestore.DocumentSnapshot;
        import com.google.firebase.firestore.FirebaseFirestore;
        import com.google.firebase.firestore.QuerySnapshot;

        import java.util.ArrayList;
        import java.util.List;

public class showActivity extends AppCompatActivity {

    RecyclerView recview;
    ArrayList<Model> datalist;
    FirebaseFirestore db;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        recview = findViewById(R.id.recview);
        db=FirebaseFirestore.getInstance();
        datalist=new ArrayList<>();
        recview.setHasFixedSize(true);
        recview.setLayoutManager(new LinearLayoutManager(this));

        adapter=new MyAdapter(datalist,this);
        recview.setAdapter(adapter);


        db.collection("Documents").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                if (!queryDocumentSnapshots.isEmpty()) {

                    List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();
                    for (DocumentSnapshot d : list) {
                        Model obj = d.toObject(Model.class);
                        datalist.add(obj);
                    }
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(showActivity.this, "No data found", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}