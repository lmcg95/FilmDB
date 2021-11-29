package com.film.FilmDatabase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
strict = true,
        plugin = {"pretty"},
        features = {"src/test/resources/features"}
//         glue = {"src/test/java/com/film/FilmDatabase"}

)
public class runner {
}
