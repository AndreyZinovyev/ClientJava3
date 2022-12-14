package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;


public class DannyeAdapter extends RecyclerView.Adapter<DannyeAdapter.ViewHolder> {

    private  LayoutInflater inflater;
    private  List<Dannye> states;

    DannyeAdapter (Context context, List<Dannye> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    public DannyeAdapter() {
    }

    @Override
    public DannyeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DannyeAdapter.ViewHolder holder, int position) {
        Dannye state = states.get(position);
        holder.flagView.setText(state.Number);
        holder.nameView.setText(state.TimeStart);
        holder.capitalView.setText(state.TImeEnd);
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }
    }

}
