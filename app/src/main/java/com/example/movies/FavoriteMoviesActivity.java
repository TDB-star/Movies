package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class FavoriteMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_movies);

        RecyclerView recyclerViewMovies = findViewById(R.id.recyclerViewFavoriteMovies);
        MoviesAdapter adapter = new MoviesAdapter();
        recyclerViewMovies.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewMovies.setAdapter(adapter);

        FavoriteMoviesViewModel viewModel = new ViewModelProvider(this)
                .get(FavoriteMoviesViewModel.class);

        viewModel.getFavoriteMovies().observe(this, new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> movies) {
                adapter.setMovies(movies);
            }
        });

        adapter.setOnMovieClickListener(new MoviesAdapter.OnMovieClickListener() {
            @Override
            public void onMovieClick(Movie movie) {
                Intent intent = MovieDetailActivity
                        .newIntent(FavoriteMoviesActivity.this, movie);
                startActivity(intent);
            }
        });
    }

    public static Intent newIntent(Context context) {
        return new Intent(context, FavoriteMoviesActivity.class);
    }
}