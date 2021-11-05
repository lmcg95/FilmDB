package cucumberTests.stepdefinitions;
import com.film.FilmDatabase.Film;
import com.film.FilmDatabase.FilmRepository;
import com.film.FilmDatabase.Staff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class employeeAdd {
    Film film = new Film("High School Musical",2008,"A High School puts on a musical",123,"PG" );

    @Autowired
    FilmRepository filmRepository;

    @Given("I am an employee of the rental company")
    public void confirmAdmin(){
        Staff staff = new Staff("Lauren", "lmcg1995");
    }

    @When("I try to add a new film to the database")
    public void addFilm(){
        Film film = new Film("High School Musical",2008,"A High School puts on a musical",123,"PG" );
        filmRepository.save(film);
    }

    @Then("The The film will be added to the database")
    public void filmAdded(){
        int ID = film.getFilm_id();
        Optional<Film> actualFilmOptional = filmRepository.findById(ID);
        Film actualFilm = actualFilmOptional.get();
        System.out.println(actualFilm);
        assertEquals(actualFilm, film);

    }




}
