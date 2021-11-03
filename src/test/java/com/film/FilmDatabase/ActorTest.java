package com.film.FilmDatabase;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest{
    @Test
    public void testFirstName(){
        Actor actor = new Actor("Penelope", "Guiness");
        assertEquals("The actor did not have the same first name", "Penelope", actor.getFirst_name());
    }

    @Test
    public void testLastName(){
        Actor actor = new Actor("Jennifer", "Lawrence");
        assertEquals("The actor did not have the same last name", "Lawrence", actor.getLast_name());
    }

    @Test
    public void testActorID(){
        Actor actor = new Actor("Joe","Pesci");
        actor.setActor_id(12);
        assertEquals("The actor did not have the same ID", 12, actor.getActor_id());
    }

    @Test
    public void testSetFirst(){
        Actor actor = new Actor();
        actor.setFirst_name("Jim");
        assertEquals("The actor did not have the same first name", "Jim", actor.getFirst_name());
    }

    @Test
    public void testSetLast(){
        Actor actor = new Actor();
        actor.setLast_name("McGonnagle");
        assertEquals("The actor did not have the same last name", "McGonnagle", actor.getLast_name());
    }

    @Test
    public void testFirstName2(){
        Actor actor = new Actor("Lauren", "McGonnagle", 1);
        assertEquals("The actor did not have the same first name", "Lauren", actor.getFirst_name());
    }

    @Test
    public void testLastName2(){
        Actor actor = new Actor("Lauren", "McGonnagle", 1);
        assertEquals("The actor did not have the same last name", "McGonnagle", actor.getLast_name());
    }

    @Test
    public void testID2(){
        Actor actor = new Actor("Lauren", "McGonnagle", 1);
        assertEquals("The actor did not have the same ID", 1, actor.getActor_id());
    }

}
