package com.marin.mark.evaluacionpractica.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.marin.mark.evaluacionpractica.R;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder>{

    private List<String> data;

    public NameAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main, parent, false);

        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
//        TextView tv = holder.itemView.findViewById(R.id.tvName);
//        String value = data.get(position);
//        tv.setText(value);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder{

        public NameViewHolder(View itemView) {
            super(itemView);
        }
    }
}
