package cucumberTests.stepdefinitions;
import com.film.FilmDatabase.Film;
import com.film.FilmDatabase.Staff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class employeeAdd {

    @Given("I am an employee of the rental company")
    public void confirmAdmin(){
        Staff staff = new Staff(21, "Lauren", "lmcg1995");
    }

    @When("I try to add a new film to the database")
    public void addFilm(){
        Film film = new Film("High School Musical",2008,"A High School puts on a musical",1006,123,"PG" );
    }




}
