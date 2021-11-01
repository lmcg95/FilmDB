package com.film.FilmDatabase;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Film {

    ///////////////////////////ATTRIBUTES//////////////////////////////////////
    private String title;
    private int filmID;
    private Date releaseDate;
    private List<Actor> cast = new ArrayList();

    /////////////////////////CONSTRUCTORS//////////////////////////////////
public Film(String title, int filmID, Date releaseDate){
    this.title=title;
    this.filmID=filmID;
    this.releaseDate=releaseDate;

}
    ///////////////////////////METHODS/////////////////////////////////////////

    public String getTitle(){
    return title;
    }

    public int getFilmID(){
    return filmID;
    }

    public void setTitle() {
        this.title = title;
    }
    public void setFilmID(){
    this.filmID=filmID;
    }


    public String actorList(){
        String json = new Gson().toJson(cast);
        return  json;
    }



    public String filmList() {
        return "{" +
                "\"title\"= \"" + title +
                "\", \"filmID\"=\"" + filmID +
                "\", \"releaseDate\"\"" + releaseDate +
                "\"}";
    }



}
