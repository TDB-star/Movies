package com.example.movies;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class Converters {

    @TypeConverter
    public static String fromPoster(Poster poster) {
        if (poster == null) {
            return null;
        }
        Gson gson = new Gson();
        return gson.toJson(poster);
    }

    @TypeConverter
    public static Poster toPoster(String posterString) {
        if (posterString == null) {
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Poster>() {}.getType();
        return gson.fromJson(posterString, type);
    }

    @TypeConverter
    public static String fromRating(Rating rating) {
        if(rating == null) {
            return null;
        }
        Gson gson = new Gson();
        return gson.toJson(rating);
    }

    @TypeConverter
    public static Rating toRating(String ratingString) {
        if (ratingString == null) {
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Poster>() {}.getType();
        return gson.fromJson(ratingString, type);
    }
}
