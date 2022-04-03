package com.platzi.java_tests.movies.data;

import com.platzi.java_tests.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findMovieById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
