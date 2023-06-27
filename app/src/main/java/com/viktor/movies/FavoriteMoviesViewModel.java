package com.viktor.movies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FavoriteMoviesViewModel extends AndroidViewModel {

    private final MovieDao movieDao;

    public FavoriteMoviesViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDataBase.getInstance(application).movieDao();
    }

    public LiveData<List<Movie>> getMovies() {
        return movieDao.getAllFavoriteMovies();
    }
}
