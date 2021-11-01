package com.film.FilmDatabase;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;
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
    
    public void setName(){
    this.name=name;
    }
    
    public void setActorID(){
    this.actorID=actorID;
    }


    public String actorList() {
        return "{" +
                "\"name\"= \"" + name +
                "\", \"actorID\"=\"" + actorID +
                "\"}";
    }

    public String filmList(){
        String json2 = new Gson().toJson(films);
        return  json2;
    }
    



}
