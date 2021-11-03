package com.film.FilmDatabase;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {
    @Test
    public void testTitle(){
        Film film = new Film("The Breakfast Club", 1980);
        assertEquals("The film was not the same Title","The Breakfast Club",film.getTitle());
    }

    @Test
    public void testYear(){
        Film film = new Film("The Breakfast Club",1980);
        assertEquals("The film was not released the same year", 1980, film.getRelease_year());
    }

    @Test
    public void testID(){
        Film film = new Film("The Breakfast Club",1980);
        film.setFilm_id(12);
        assertEquals("The film was not the same id", 12, film.getFilm_id());
    }

    @Test
    public void testDescription(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The film did not have the same description","The true story of stockbroker Jordan Belfort", film.getDescription());
    }

    @Test
    public void testLength(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The film was not the same length", 180, film.getLength());
    }

    @Test
    public void testRating(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The film was not the same rating", "18", film.getRating());
    }

    @Test
    public void testID2(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The film was not the same ID", 1003, film.getFilm_id());
    }

    @Test
    public void testTitle2(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The film was not the same title", "The Wolf of Wall Street", film.getTitle());
    }

    @Test
    public void testYear2(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The film was not the same release year", 2013, film.getRelease_year());
    }

    @Test
    public void testSetTitle(){
        Film film = new Film();
        film.setTitle("The Wolf of Wall Street");
        assertEquals("The film was not the same title","The Wolf of Wall Street", film.getTitle());
    }

    @Test
    public void testSetYear(){
        Film film = new Film();
        film.setRelease_year(2013);
        assertEquals("The film was not the same release year", 2013, film.getRelease_year());
    }

    @Test
    public void testSetDescription(){
        Film film = new Film();
        film.setDescription("The best film");
        assertEquals("The film was not the same description", "The best film", film.getDescription());
    }

    @Test
    public void testSetLength(){
        Film film = new Film();
        film.setLength(120);
        assertEquals("The film was not the same length", 120, film.getLength());
    }

    @Test
    public void testSetRating(){
        Film film = new Film();
        film.setRating("PG");
        assertEquals("The film was not the same rating", "PG", film.getRating());
    }

}
