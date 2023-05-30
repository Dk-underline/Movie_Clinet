package com.fullstack.mioveApi.dao;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.mioveApi.entity.Movie;

@Repository
public interface MoviesRepo extends MongoRepository<Movie, ObjectId> {
	Optional<Movie> findMoviesByImdbId(String imdb);
}
