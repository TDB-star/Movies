package com.example.movies;

import android.app.Application;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

@Database(entities = {Movie.class}, version = 1, exportSchema = false)
@TypeConverters(Converters.class)
public abstract class MovieDatabase extends RoomDatabase {

    private static final String DB_NAME = "movie.db";
    public static MovieDatabase instance = null;

    public static MovieDatabase getInstance(Application application) {
        if(instance == null) {
            instance = Room.databaseBuilder(
                    application,
                    MovieDatabase.class,
                    DB_NAME
            ).build();
        }
        return instance;
    }

    abstract MovieDao movieDao();
}
