package com.film.FilmDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
public class FilmDatabaseApplication {

	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private ActorRepository actorRepository;


	public static void main(String[] args) {
		SpringApplication.run(FilmDatabaseApplication.class, args);
	}


	@GetMapping("/films")
	public @ResponseBody Iterable<Film> getAllUsers(){
		return filmRepository.findAll();
	}

	@GetMapping("/actors")
	public @ResponseBody Iterable<Actor> getAllUsers2(){
		return actorRepository.findAll();
	}

	@GetMapping("/actorsByID")
	public @ResponseBody
	Optional<Actor> getAllUsers3(){
		return actorRepository.findById(1);
	}

	@GetMapping("/filmsByID")
	public @ResponseBody
	Optional<Film> getAllUsers4(){
		return filmRepository.findById(13);
	}


	@PostMapping("/addFilm")
	public @ResponseBody String addAFilm (@RequestParam String title
			, @RequestParam int release_year) {


		Film savedFilm = new Film(title, release_year);
		filmRepository.save(savedFilm);
		return "Saved";

	}



}
