package com.film.FilmDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Actor {

    ///////////////////////////ATTRIBUTES////////////////////////////////////

    private String name;
    private int actorID;
    private List<Film> films = new ArrayList();
    private Date releaseDate;


    //////////////////////////CONSTRUCTORS//////////////////////////////////
public Actor(String name, int actorID, Date releaseDate){
    this.name = name;
    this.actorID = actorID;
    this.releaseDate=releaseDate;
}
    ////////////////////////////METHODS////////////////////////////////////

    public String getName(){
    return name;
    }

    public int getActorID(){
    return actorID;
    }


}
