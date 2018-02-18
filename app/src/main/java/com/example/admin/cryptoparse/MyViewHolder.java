package com.example.admin.cryptoparse;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView rank, name;

    public MyViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        rank = itemView.findViewById(R.id.ranking);
        name = itemView.findViewById(R.id.name);
    }

    @Override
    public void onClick(View view) {
    }
}