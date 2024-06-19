package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReviewResponse {

    @SerializedName("docs")
    private List<Review> reviewliste;

    public List<Review> getReviewliste() {
        return reviewliste;
    }

    public ReviewResponse(List<Review> reviewliste) {
        this.reviewliste = reviewliste;
    }

    @Override
    public String toString() {
        return "ReviewResponse{" +
                "reviewliste=" + reviewliste +
                '}';
    }
}
