package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Review {
    @SerializedName("type")
    String type;
    @SerializedName("review")
    String review;
    @SerializedName("author")
    String author;

    public String getType() {
        return type;
    }

    public String getReview() {
        return review;
    }

    public String getAuthor() {
        return author;
    }

    public Review(String type, String review, String author) {
        this.type = type;
        this.review = review;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Review{" +
                "type='" + type + '\'' +
                ", review='" + review + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
