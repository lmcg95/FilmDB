package com.film.FilmDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

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


	//@GetMapping("/films")
	//public @ResponseBody Iterable<Film> getAllUsers(){
	//	return filmRepository.findAll();
	//}

	@GetMapping("/actors")
	public @ResponseBody Iterable<Actor> getAllUsers2(){
		return actorRepository.findAll();
	}


}
