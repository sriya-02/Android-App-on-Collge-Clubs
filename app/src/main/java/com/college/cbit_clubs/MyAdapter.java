package com.college.cbit_clubs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder>
{
    ArrayList<Model> datalist;

    Context context;
    public MyAdapter(ArrayList<Model> datalist,Context context) {

        this.datalist = datalist;
        this.context=context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        Model model=datalist.get(position);
        holder.t1.setText(model.getEventname());
        holder.t2.setText(model.getVenue());
        holder.t3.setText(model.getDate());
        holder.t4.setText(model.getTime());
        holder.t5.setText(model.getDescription());


    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {

        final TextView t1;
        final  TextView t2;
        final  TextView t3;
        final  TextView t4;
        final  TextView  t5;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            t3=itemView.findViewById(R.id.t3);
            t4=itemView.findViewById(R.id.t4);
            t5=itemView.findViewById(R.id.t5);


        }
    }
}