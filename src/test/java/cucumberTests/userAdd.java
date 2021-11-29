package cucumberTests;
import com.film.FilmDatabase.Film;
import com.film.FilmDatabase.FilmRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class userAdd {
    String title;
    int release_year;
    String description;
    int length;
    String rating;

    Film testFilm;


@Autowired
    FilmRepository testFilmRepository;

@Given("I have all of the information required about the film")
    public void haveAllInfoToAdd(){


}

@When("I try to add the film with title {string}, release year {int}, length {int}, description {string}, rating {string}")
    public void inputInformation(String title, int release_year, String description, int length, String rating){
        testFilm = new Film(title, release_year, description, length, rating);
        testFilmRepository.save(testFilm);
    }

    @Then("Then I will be told {string}")
    public void filmAdded(String string){
    assertEquals("Saved", testFilmRepository.save(testFilm).toString());
//    int newID = testFilmRepository.searchByTitleLike(title).get(0).getFilm_id();
//    assertEquals(title, testFilmRepository.findById(newID).get().getTitle());
//    assertEquals(release_year, testFilmRepository.findById(newID).get().getRelease_year());
//    assertEquals(description, testFilmRepository.findById(newID).get().getDescription());
//    assertEquals(length, testFilmRepository.findById(newID).get().getLength());
//    assertEquals(rating, testFilmRepository.findById(newID).get().getRating());

    }



}
