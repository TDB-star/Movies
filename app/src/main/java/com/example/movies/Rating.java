package com.example.movies;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("kp")
    private String kp;

    public Rating(String rating) {
        this.kp = rating;
    }

    public String getRating() {
        return kp;
    }
}
