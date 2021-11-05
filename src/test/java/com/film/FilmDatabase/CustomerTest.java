package com.film.FilmDatabase;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    Customer customer = new Customer(1, "laurenmcgonnagle@sakilacustomer.com", "laurenmcgonnagle","Lauren", "McGonnagle");



    @Test
    void testGetCustomer_id() {
        assertEquals(1, customer.getCustomer_id(), "The ID was not the same");
    }

    @Test
    void testId() {
        customer.setCustomer_id(2);
        assertEquals(2, customer.getCustomer_id(), "The ID was not the same");
    }

    @Test
    void testGetEmail() {
        assertEquals("laurenmcgonnagle@sakilacustomer.com", customer.getEmail(), "The email was not the same");
    }

    @Test
    void testSetEmail() {
        customer.setEmail("dylanmadden@sakilacustomer.com");
        assertEquals("dylanmadden@sakilacustomer.com", customer.getEmail(),"The email was not the same");
    }

    @Test
    void testGetPassword() {
        assertEquals("laurenmcgonnagle", customer.getPassword(), "The password was not the same");
    }

    @Test
    void TestSetPassword() {
        customer.setPassword("lauren");
        assertEquals("lauren", customer.getPassword(), "the password was not the same");
    }

    @Test
    void testGetFirst_name() {
        assertEquals("Lauren", customer.getFirst_name(), "the first name was not the same");
    }

    @Test
    void testSetFirst_name() {
        customer.setFirst_name("Dylan");
        assertEquals("Dylan", customer.getFirst_name(), "The first name was not the same");
    }

    @Test
    void testGetLast_name() {
        assertEquals("McGonnagle", customer.getLast_name(), "the last name was not the same");
    }

    @Test
    void testSetLast_name() {
        customer.setLast_name("Madden");
        assertEquals("Madden", customer.getLast_name(), "The last name was not the same");
    }

////    @Test
////    void isPrivellages() {
////    }
////
////    @Test
////    void setPrivellages() {
//    }
}

