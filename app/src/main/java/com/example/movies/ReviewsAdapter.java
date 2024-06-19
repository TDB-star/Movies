package com.example.movies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsViewsHolder> {

    private List<Review> reviews = new ArrayList<>();

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ReviewsViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(
                        R.layout.review_item,
                        parent,
                        false
                );
        return new ReviewsViewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsViewsHolder holder, int position) {

        Review review = reviews.get(position);
        holder.textViewAuthor.setText(review.getAuthor());
        holder.textViewReview.setText(review.getReview());

    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    static class ReviewsViewsHolder extends RecyclerView.ViewHolder {

        private final TextView textViewAuthor;
        private final TextView textViewReview;

        public ReviewsViewsHolder(@NonNull View itemView) {
            super(itemView);
            textViewAuthor = itemView.findViewById(R.id.textViewAuthor);
            textViewReview = itemView.findViewById(R.id.textViewReview);

        }
    }
}
