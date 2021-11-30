package com.film.FilmDatabase;
//import com.film.FilmDatabase.Film;
//import com.film.FilmDatabase.FilmRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class userAdd {




@Autowired
    FilmRepository DeleteTestFilmRepository;

private Film testFilm;




    @Given("I have all of the information required about the film")
    public void i_have_all_of_the_information_required_about_the_film() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I try to add the film with title {string}, release year {int}, description {string}, length {int}, rating {string}")
    public void i_try_to_add_the_film_with_title_release_year_description_length_rating(String title, Integer release_year, String description, Integer length, String rating) {
        // Write code here that turns the phrase above into concrete actions

        testFilm = new Film(title, release_year, description, length, rating);
        DeleteTestFilmRepository.save(testFilm);

    }

    @Then("The new film will be added to the database with title {string}, release year {int}, description {string}, length {int}, rating {string}")
    public void the_new_film_will_be_added_to_the_database_with_title_release_year_description_length_rating(String title, int release_year, String description, int length, String rating) {
        // Write code here that turns the phrase above into concrete actions
        int newID = DeleteTestFilmRepository.searchByTitleLike(title).get(0).getFilm_id();
        assertEquals(DeleteTestFilmRepository.findById(newID).get().getTitle(), title);
        assertEquals(DeleteTestFilmRepository.findById(newID).get().getRelease_year(), release_year);
        assertEquals(DeleteTestFilmRepository.findById(newID).get().getDescription(), description);
        assertEquals(DeleteTestFilmRepository.findById(newID).get().getLength(), length);
        assertEquals(DeleteTestFilmRepository.findById(newID).get().getRating(), rating);


    }

    



}
