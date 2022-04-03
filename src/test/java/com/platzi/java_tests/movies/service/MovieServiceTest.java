package com.platzi.java_tests.movies.service;

import com.platzi.java_tests.movies.data.MovieRepository;
import com.platzi.java_tests.movies.model.Genre;
import com.platzi.java_tests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.platzi.java_tests.movies.model.Genre.*;
import static org.junit.Assert.*;

public class MovieServiceTest {

    @Test
    public void returnMoviesByGenre() {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.findAll()).thenReturn(Arrays.asList(
                new Movie(1, "Dark Knight", 152, ACTION),
                new Movie(2, "Memento", 113, THRILLER),
                new Movie(3, "There's Something About Mary", 119, COMEDY),
                new Movie(4, "Super 8", 112, THRILLER),
                new Movie(5, "Scream", 111, HORROR),
                new Movie(6, "Home Alone", 103, COMEDY),
                new Movie(7, "Matrix", 136, ACTION)
        ));


        MovieService movieService = new MovieService(movieRepository);

        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);

        List<Integer> moviesIds = movies.stream().map(Movie::getId).collect(Collectors.toList());
        assertThat(moviesIds, CoreMatchers.is(Arrays.asList(3, 6)));
    }
}