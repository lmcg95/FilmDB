package com.film.FilmDatabase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Actor {

    ///////////////////////////ATTRIBUTES////////////////////////////////////
@Id
private int actor_id;


    private String first_name;
    private String last_name;






    //////////////////////////CONSTRUCTORS//////////////////////////////////
public Actor(String first_name, String last_name){
    this.first_name = first_name;
    this.last_name=last_name;


}

public Actor(String first_name, String last_name, int actor_id){
    this.first_name = first_name;
    this.last_name=last_name;
    this.actor_id=actor_id;

}

public Actor(){

}
    ////////////////////////////METHODS////////////////////////////////////

    public String getFirst_name(){
    return first_name;
    }
    public String getLast_name(){
        return last_name;
    }

    public int getActor_id(){
    return actor_id;
    }

    public void setActor_id(int actor_id){
    this.actor_id = actor_id;
    }

    public void setFirst_name(String first_name){
    this.first_name=first_name;
    }

    public void setLast_name(String last_name){
        this.last_name=last_name;
    }










}
