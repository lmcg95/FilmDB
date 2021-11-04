package com.film.FilmDatabase;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest{
    @Test
    public void testFirstName(){
        Actor actor = new Actor("Penelope", "Guiness");
        assertEquals("Penelope", actor.getFirst_name(),"The actor did not have the same first name");
    }

    @Test
    public void testLastName(){
        Actor actor = new Actor("Jennifer", "Lawrence");
        assertEquals( "Lawrence", actor.getLast_name(),"The actor did not have the same last name");
    }

    @Test
    public void testActorID(){
        Actor actor = new Actor("Joe","Pesci");
        actor.setActor_id(12);
        assertEquals( 12, actor.getActor_id(),"The actor did not have the same ID");
    }

    @Test
    public void testSetFirst(){
        Actor actor = new Actor();
        actor.setFirst_name("Jim");
        assertEquals( "Jim", actor.getFirst_name(),"The actor did not have the same first name");
    }

    @Test
    public void testSetLast(){
        Actor actor = new Actor();
        actor.setLast_name("McGonnagle");
        assertEquals( "McGonnagle", actor.getLast_name(),"The actor did not have the same last name");
    }

    @Test
    public void testFirstName2(){
        Actor actor = new Actor("Lauren", "McGonnagle", 1);
        assertEquals( "Lauren", actor.getFirst_name(),"The actor did not have the same first name");
    }

    @Test
    public void testLastName2(){
        Actor actor = new Actor("Lauren", "McGonnagle", 1);
        assertEquals( "McGonnagle", actor.getLast_name(),"The actor did not have the same last name");
    }

    @Test
    public void testID2(){
        Actor actor = new Actor("Lauren", "McGonnagle", 1);
        assertEquals( 1, actor.getActor_id(),"The actor did not have the same ID");
    }

}
