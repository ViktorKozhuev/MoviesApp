package com.viktor.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"X-API-KEY: 0QFRG0N-SNSMW9C-MEDMHCQ-YGEV8EA"})
    @GET("/v1.3/movie")
    Single<MovieResponse> loadMovie(
            @Query("page") int page,
            @Query("limit") int limit
    );

    @Headers({"X-API-KEY: 0QFRG0N-SNSMW9C-MEDMHCQ-YGEV8EA"})
    @GET("/v1.3/movie/{id}")
    Single<TrailerResponse> loadTrailers(@Path("id") int page);

    @Headers({"X-API-KEY: 0QFRG0N-SNSMW9C-MEDMHCQ-YGEV8EA"})
    @GET("/v1/review")
    Single<ReviewResponse> loadReviews(@Query("movieId") int movieId);

}
