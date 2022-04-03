package com.platzi.java_tests.movies.data;

import com.platzi.java_tests.movies.model.Genre;
import com.platzi.java_tests.movies.model.Movie;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {

    private MovieRepositoryJdbc movieRepository;
    private DataSource dataSource;

    @Before
    public void setUp() throws Exception {
         dataSource =
                new DriverManagerDataSource(
                        "jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa"
                );

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void loadAllMovies() throws SQLException {

        Collection<Movie> movies = movieRepository.findAll();
        List<Movie> list = Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        );
        assertEquals(movies,list);

    }

    @Test
    public void loadMovieById() {
        Movie movie = movieRepository.findById(2);

        assertEquals(new Movie(2, "Memento", 113, Genre.THRILLER), movie);
    }

    @Test
    public void insertAMovie() {
        Movie movie = new Movie("Super 8", 112, Genre.THRILLER);
        movieRepository.saveOrUpdate(movie);

        Movie movieFromDb = movieRepository.findById(4);
        movie.setId(4);

        assertEquals(movie, movieFromDb);
    }

    @After
    public void tearDown() throws Exception {

        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
}