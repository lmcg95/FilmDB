package com.film.FilmDatabase;

import java.util.ArrayList;
import java.util.List;

public class Actor {

    ///////////////////////////ATTRIBUTES////////////////////////////////////

    private String name;
    private int actorID;
    private List<Film> films = new ArrayList();


    //////////////////////////CONSTRUCTORS//////////////////////////////////
public Actor(String name, int actorID){
    this.name = name;
    this.actorID = actorID;
}
    ////////////////////////////METHODS////////////////////////////////////

    public String getName(){
    return name;
    }

    public int getActorID(){
    return actorID;
    }


}
