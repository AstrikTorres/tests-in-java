package com.platzi.java_tests.movies.service;

import com.platzi.java_tests.movies.data.MovieRepository;
import com.platzi.java_tests.movies.model.Genre;
import com.platzi.java_tests.movies.model.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {

        return movieRepository.findAll().stream()
                .filter(m -> m.getGenre() == genre)
                    .collect(Collectors.toList());
    }
}
