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
    FilmRepository testFilmRepository;

private Film testFilm;

@Given("I have all of the information required about the film")
    public void haveAllInfoToAdd(){


}

@When("I try to add the film with title {string}, release year {int}, length {int}, description {string}, rating {string}")
    public void inputInformation(String title, int release_year, String description, int length, String rating){
        testFilm = new Film(title, release_year, description, length, rating);
        testFilmRepository.save(testFilm);
    }

    @Then("The new film will be added to the database with title {string}, release year {int}, length {int}, description {string}, rating {string}")
    public void filmAdded(String title, int release_year, String description, int length, String rating, String string){
    int newID = testFilmRepository.searchByTitleLike(title).get(0).getFilm_id();
    assertEquals(testFilmRepository.findById(newID).get().getTitle(), title);
    assertEquals(testFilmRepository.findById(newID).get().getRelease_year(), release_year);
    assertEquals(testFilmRepository.findById(newID).get().getDescription(), description);
    assertEquals(testFilmRepository.findById(newID).get().getLength(), length);
    assertEquals(testFilmRepository.findById(newID).get().getRating(), rating);

    }



}
