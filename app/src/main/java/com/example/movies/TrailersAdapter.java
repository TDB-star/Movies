package com.example.movies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TrailersAdapter  extends RecyclerView.Adapter<TrailersAdapter.TrailersViewsHolder>{

    private List<Trailer> trailers = new ArrayList<>();
    private onTrailerClickListener onTrailerClickListener;

    public void setOnTrailerClickListener(TrailersAdapter.onTrailerClickListener onTrailerClickListener) {
        this.onTrailerClickListener = onTrailerClickListener;
    }

    public void setTrailers(List<Trailer> trailers) {
        this.trailers = trailers;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TrailersViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(
                        R.layout.trailer_item,
                        parent,
                        false
                );

        return new TrailersViewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrailersViewsHolder holder, int position) {
        Trailer trailer = trailers.get(position);
        holder.textViewTrailerName.setText(trailer.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onTrailerClickListener != null) {
                    onTrailerClickListener.onTrailerClick(trailer);
                }
            }
        });
    }

    interface onTrailerClickListener {
        void onTrailerClick(Trailer trailer);
    }

    @Override
    public int getItemCount() {
        return trailers.size();
    }

    static class TrailersViewsHolder extends RecyclerView.ViewHolder {
        private final TextView textViewTrailerName;

        public TrailersViewsHolder(@NonNull View itemView) {
            super(itemView);
            textViewTrailerName = itemView.findViewById(R.id.textViewTrailerName);
        }
    }
}
