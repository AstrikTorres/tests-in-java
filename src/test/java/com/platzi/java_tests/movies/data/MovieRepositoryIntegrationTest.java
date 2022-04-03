package com.platzi.java_tests.movies.data;

import com.platzi.java_tests.movies.model.Genre;
import com.platzi.java_tests.movies.model.Movie;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class MovieRepositoryIntegrationTest {

    @Test
    public void loadAllMovies() throws SQLException {

        DataSource datasource =
                new DriverManagerDataSource(
                        "jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa"
                );

        ScriptUtils.executeSqlScript(datasource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);

        MovieRepository movieRepository = new MovieRepositoryJdbc(jdbcTemplate);

        Collection<Movie> movies = movieRepository.findAll();
        List<Movie> list = Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        );
        assertEquals(movies,list);


    }
}