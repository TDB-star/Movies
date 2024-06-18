package com.example.movies;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {

    @SerializedName("kp")
    private double kp;

    public Rating(double rating) {

        this.kp = rating;
    }

    public double getKp() {
        return kp;
    }


    @Override
    public String toString() {
        return "Rating{" +
                "kp='" + kp + '\'' +
                '}';
    }
}
