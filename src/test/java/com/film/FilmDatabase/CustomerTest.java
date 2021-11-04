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
    void testSetCustomer_id() {
        
    }

    @Test
    void getEmail() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void getPassword() {
    }

    @Test
    void setPassword() {
    }

    @Test
    void getFirst_name() {
    }

    @Test
    void setFirst_name() {
    }

    @Test
    void getLast_name() {
    }

    @Test
    void setLast_name() {
    }

    @Test
    void isPrivellages() {
    }

    @Test
    void setPrivellages() {
    }
}

