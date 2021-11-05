package com.film.FilmDatabase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.film.FilmDatabase.Staff;


public class StaffTest {

    Staff staff = new Staff(21,"lauren", "1995");





    @Test
    void testGetStaff_id() {
        assertEquals(21, staff.getStaff_id(), "not the same ID");
    }



    @Test
    void testSetStaff_id() {
        staff.setStaff_id(12);
        assertEquals(12, staff.getStaff_id(), "The ID was not the same");
    }

    @Test
    void testGetUsername() {
        assertEquals("lauren", staff.getUsername(), "The username was not the same");
    }

    @Test
    void testSetUsername() {
        staff.setUsername("Dylan");
        assertEquals("Dylan", staff.getUsername(), "The username was not the same");
    }

    @Test
    void testGetPassword() {
        assertEquals("1995", staff.getPassword(), "The password was not the same");
    }

    @Test
    void testSetPassword() {
        staff.setPassword("hey");
        assertEquals("hey",staff.getPassword(), "The password was not the same");
    }

//    @Test
//    void isPrivellages() {
//    }
//
//    @Test
//    void setPrivellages() {
//    }
}