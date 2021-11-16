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
public class employeeAdd {
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
    title = "test";
    release_year = 3000;
    description = "This is a film";
    length = 147568345;
    rating = "X";

}

@When("I input all the information")
    public void inputInfo(){
    testFilm = new Film(title, release_year, description,length,rating);
    testFilmRepository.save(testFilm);
}

@Then("The film will be added to the database and I will be told {string}")
    public void addedToDatabase(){
    int testID = testFilm.getFilm_id();
    Optional<Film> actualFilmOptional = testFilmRepository.findById(testID);
    Film actualFilm = actualFilmOptional.get();
    System.out.println(testFilm);
    assertTrue(actualFilm.equals(testFilm));








}
}
