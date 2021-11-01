package com.film.FilmDatabase;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Film {

    ///////////////////////////ATTRIBUTES//////////////////////////////////////
@Id
    private int film_id;

    private String title;
    private int release_year;


    /////////////////////////CONSTRUCTORS//////////////////////////////////
public Film(String title,int release_year){
    this.title=title;
    this.release_year = release_year;

}

public Film(){

}
    ///////////////////////////METHODS/////////////////////////////////////////

    public String getTitle(){
    return title;
    }

    public int getFilm_id(){
    return film_id;
    }
    
    public int getRelease_year(){
    return release_year;
    }

    public void setTitle(String title){
    this.title = title;
    }

    public void setFilm_id(int film_id){
    this.film_id = film_id;
    }

    public void setRelease_year(int release_year){
    this.release_year = release_year;
    }
    
    









}
