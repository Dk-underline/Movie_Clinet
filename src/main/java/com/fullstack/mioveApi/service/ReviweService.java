package com.fullstack.mioveApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.fullstack.mioveApi.dao.ReviweRepo;
import com.fullstack.mioveApi.entity.Movie;
import com.fullstack.mioveApi.entity.Reviwe;

@Service
public class ReviweService {
	@Autowired
	private ReviweRepo reviweRepo;
	@Autowired
	private MongoTemplate mongoTemplate;

	public Reviwe createReviwe(String reviweBody, String imdbId) {
		Reviwe newrv = reviweRepo.insert(new Reviwe(reviweBody));
		mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId))
				.apply(new Update().push("reviweIds").value(newrv)).first();
//		System.out.println(reviweBody + " " + newrv.getReviweBody());
		return newrv;
	}
}
