package com.film.FilmDatabase;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {
    @Test
    public void testTitle(){
        Film film = new Film("The Breakfast Club", 1980);
        assertEquals("The Breakfast Club",film.getTitle(),"The film was not the same Title");
    }

    @Test
    public void testYear(){
        Film film = new Film("The Breakfast Club",1980);
        assertEquals( 1980, film.getRelease_year(),"The film was not released the same year");
    }

    @Test
    public void testID(){
        Film film = new Film("The Breakfast Club",1980);
        film.setFilm_id(12);
        assertEquals(12, film.getFilm_id(),"The film was not the same id");
    }

    @Test
    public void testDescription(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The true story of stockbroker Jordan Belfort", film.getDescription(),"The film did not have the same description");
    }

    @Test
    public void testLength(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals(180, film.getLength(),"The film was not the same length");
    }

    @Test
    public void testRating(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals( "18", film.getRating(),"The film was not the same rating");
    }

    @Test
    public void testID2(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals(1003, film.getFilm_id(),"The film was not the same ID");
    }

    @Test
    public void testTitle2(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals("The Wolf of Wall Street", film.getTitle(),"The film was not the same title");
    }

    @Test
    public void testYear2(){
        Film film = new Film("The Wolf of Wall Street",2013,"The true story of stockbroker Jordan Belfort",1003,180, "18");
        assertEquals( 2013, film.getRelease_year(),"The film was not the same release year");
    }

    @Test
    public void testSetTitle(){
        Film film = new Film();
        film.setTitle("The Wolf of Wall Street");
        assertEquals("The Wolf of Wall Street", film.getTitle(),"The film was not the same title");
    }

    @Test
    public void testSetYear(){
        Film film = new Film();
        film.setRelease_year(2013);
        assertEquals(2013, film.getRelease_year(),"The film was not the same release year");
    }

    @Test
    public void testSetDescription(){
        Film film = new Film();
        film.setDescription("The best film");
        assertEquals( "The best film", film.getDescription(),"The film was not the same description");
    }

    @Test
    public void testSetLength(){
        Film film = new Film();
        film.setLength(120);
        assertEquals( 120, film.getLength(),"The film was not the same length");
    }

    @Test
    public void testSetRating(){
        Film film = new Film();
        film.setRating("PG");
        assertEquals("PG", film.getRating(),"The film was not the same rating");
    }

}
