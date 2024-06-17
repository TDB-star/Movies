package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=281KYP4-NV4MRQR-KDPV1E7-CHPW68E&rating.imdb=7-10&sortField=votes.kp&sortType=-1")
    Single<MovieResponse> loadMovies(@Query("page") int page);
}
