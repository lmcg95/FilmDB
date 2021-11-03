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
    private String description;
    private int length;
    private String rating;



    /////////////////////////CONSTRUCTORS//////////////////////////////////
public Film(String title,int release_year){
    this.title=title;
    this.release_year = release_year;


}

    public Film(String title,int release_year, String description, int film_id, int length, String rating){
        this.title=title;
        this.release_year = release_year;
        this.description=description;
        this.film_id=film_id;
        this.length=length;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
