package com.example.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie?token=281KYP4-NV4MRQR-KDPV1E7-CHPW68E&rating.imdb=4-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie/{id}?token=281KYP4-NV4MRQR-KDPV1E7-CHPW68E")
    Single<TrailerResponse> loadTrailers(@Path("id") int id);
}
