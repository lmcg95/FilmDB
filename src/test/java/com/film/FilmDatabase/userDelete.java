package com.film.FilmDatabase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;


public class userDelete {

    @Autowired
    FilmRepository testFilmRepository;

    private Film testFilm;

    @Given("The film with ID {int} is in the database")
    public void filmInDatabase(int film_id){
        testFilm = testFilmRepository.findById(film_id).get();

    }

    @When("I try to delete the film with ID {int}")
    public void tryDeleteFilm(int film_id){
        testFilmRepository.deleteById(film_id);
    }

    @Then("The film with ID {int} will no longer exist in the database")
    public void filmNotExist(int film_id){
        assertNotEquals(testFilm.getFilm_id(), testFilmRepository.findById(film_id).isPresent());
    }
}





