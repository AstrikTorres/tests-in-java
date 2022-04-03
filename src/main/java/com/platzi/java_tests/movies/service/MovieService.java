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

    public Collection<Movie> findMoviesByLength(int length) {
        return movieRepository.findAll().stream()
                .filter(m -> m.getMinutes() <= length)
                    .collect(Collectors.toList());
    }

    public Collection<Movie> findByName(String name) {

        String nameMovie = name.toUpperCase().charAt(0) +
                name.substring(1, name.length()).toLowerCase();

        return movieRepository.findAll().stream()
                .filter(m -> m.getName().contains(nameMovie))
                        .collect(Collectors.toList()
                );
    }
}
