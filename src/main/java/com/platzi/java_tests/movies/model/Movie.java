package com.platzi.java_tests.movies.model;

public class Movie {

    private static Integer idCounterMovie;

    static {
        idCounterMovie = 0;
    }

    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(String name, int minutes, Genre genre) {
        this(idCounterMovie++, name, minutes, genre);
    }

    public Movie(Integer id, String name, int minutes, Genre genre) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }

    public static Integer getIdCounterMovie() {
        return idCounterMovie;
    }

    public static void setIdCounterMovie(Integer idCounterMovie) {
        Movie.idCounterMovie = idCounterMovie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

}
