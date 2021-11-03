package com.film.FilmDatabase;


import com.film.FilmDatabase.Film;
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


}
