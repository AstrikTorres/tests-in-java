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

    public Collection<Movie> findMoviesByLength(Integer length) {
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

    public Collection<Movie> findById(long id) {
        return movieRepository.findAll().stream()
                .filter(m -> m.getId() == id)
                .collect(Collectors.toList());
    }

    public Collection<Movie> findByTemplate(Movie template) {
        Collection<Movie> leakedMovies = new ArrayList<Movie>();
        Collection<Movie> movies = new ArrayList<Movie>();

        Integer id = template.getId();
        String name = template.getName();
        Integer minutes = template.getMinutes();
        Genre genre = template.getGenre();

        if (id != null) return findById(id);

        if (name != null) {
            movies = findByName(name);
            for (Movie movie : movies) {
                if (minutes != null || genre != null) {
                    if (minutes != null) {
                        if (movie.getMinutes() <= minutes)
                            leakedMovies.add(movie);
                    }
                    if (genre != null) {
                        if (genre == movie.getGenre())
                            leakedMovies.add(movie);
                    }
                } else leakedMovies.add(movie);
            }
        } else if (minutes != null) {
            movies = findMoviesByLength(minutes);
            for (Movie movie : movies) {
                if (genre != null) {
                    if (genre == movie.getGenre())
                        leakedMovies.add(movie);
                }
                else leakedMovies.add(movie);
            }
        } else if (genre != null) {
            movies = findMoviesByGenre(genre);
            leakedMovies.addAll(movies);
        }

        return leakedMovies;
    }


}
