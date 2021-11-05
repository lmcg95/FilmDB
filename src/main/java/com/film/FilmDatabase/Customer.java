package com.film.FilmDatabase;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private int customer_id;

    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private boolean admin = Boolean.FALSE;

    public Customer(String email, String password, String first_name, String last_name) {

        this.email = email;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
    }



    public void Customer(){

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public boolean isNotAdmin() {
        return admin;
    }

    public void setNotAdmin(boolean notAdmin) {
        this.admin = notAdmin;
    }


}
