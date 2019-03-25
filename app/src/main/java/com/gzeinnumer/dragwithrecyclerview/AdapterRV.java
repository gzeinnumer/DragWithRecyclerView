package com.gzeinnumer.dragwithrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

//todo 2
public class AdapterRV extends RecyclerView.Adapter<AdapterRV.MyHolder> {
    private Context context;
    private List<DataNo> list;

    public AdapterRV(Context context, List<DataNo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //todo 3
        View view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);
        //end todo
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.no.setText(String.valueOf(list.get(i).getNo()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView no;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            no = itemView.findViewById(R.id.no);
        }
    }
}
