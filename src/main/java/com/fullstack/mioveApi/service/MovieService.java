package com.fullstack.mioveApi.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.mioveApi.dao.MoviesRepo;
import com.fullstack.mioveApi.entity.Movie;

@Service
public class MovieService {
	@Autowired
	private MoviesRepo moviesRepo;

	public List<Movie> allMovies() {
		return moviesRepo.findAll();
	}

	public Optional<Movie> getById(ObjectId id) {
		return moviesRepo.findById(id);
	}

	public Optional<Movie> getByImdbId(String id) {
		return moviesRepo.findMoviesByImdbId(id);
	}
}
