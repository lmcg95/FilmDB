package com.film.FilmDatabase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
    @Id
    private int staff_id;
    
    private String username;
    private String password;
    private boolean admin = Boolean.TRUE;



    public Staff(int staff_id, String username, String password){
        this.password=password;
        this.username=username;
        this.staff_id=staff_id;
    }


    public Staff(){

    }


    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
