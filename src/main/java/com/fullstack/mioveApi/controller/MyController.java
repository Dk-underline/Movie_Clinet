package com.fullstack.mioveApi.controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.mioveApi.entity.Movie;
import com.fullstack.mioveApi.service.MovieService;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "http://localhost:3000")
public class MyController {
	@Autowired
	private MovieService movieService;

//	@GetMapping("/")
//	public String home() {
//		return "Welcome Home";
//	}

	@GetMapping("/")
	public ResponseEntity<List<Movie>> getAllMovies() {
//		System.out.println("All Is Well");
		List<Movie> movies = movieService.allMovies();
//		System.out.print(" " + movies.size());
		return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId id) {
		return new ResponseEntity<Optional<Movie>>(movieService.getById(id), HttpStatus.OK);
	}

	@GetMapping("/imdb/{id}")
	public ResponseEntity<Optional<Movie>> getMovieByImdbId(@PathVariable String id) {
		return new ResponseEntity<Optional<Movie>>(movieService.getByImdbId(id), HttpStatus.OK);
	}
}
