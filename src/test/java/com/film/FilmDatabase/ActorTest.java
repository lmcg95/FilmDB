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

}
