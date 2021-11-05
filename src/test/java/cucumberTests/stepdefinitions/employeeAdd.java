package cucumberTests.stepdefinitions;
import com.film.FilmDatabase.Film;
import com.film.FilmDatabase.FilmRepository;
import com.film.FilmDatabase.Staff;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class employeeAdd {

     String title;
    int release_year;
   String description;
     int length;
     String rating;


@Autowired
    FilmRepository testFilmRepository;








}
