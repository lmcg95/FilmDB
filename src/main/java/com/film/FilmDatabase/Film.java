package com.film.FilmDatabase;

import java.util.List;
import java.util.ArrayList;



public class Film {

    ///////////////////////////ATTRIBUTES//////////////////////////////////////
    private String title;
    private int filmID;
    private List<Actor> cast = new ArrayList();

    /////////////////////////CONSTRUCTORS//////////////////////////////////
public Film(String title, int filmID){
    this.title=title;
    this.filmID=filmID;

}
    ///////////////////////////METHODS/////////////////////////////////////////

    public String getTitle(){
    return title;
    }

    public int getFilmID(){
    return filmID;
    }


}
