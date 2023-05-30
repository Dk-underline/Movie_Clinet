package com.fullstack.mioveApi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.mioveApi.entity.Reviwe;
import com.fullstack.mioveApi.service.ReviweService;

@RestController
@RequestMapping("/api/reviwes")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviweController {
	@Autowired
	private ReviweService reviweService;

	@PostMapping()
	public ResponseEntity<Reviwe> createReviwes(@RequestBody Map<String, String> payload) {
//		System.out.println(payload.get("reviweBody") + " " + payload.get("imdbId"));
		return new ResponseEntity<Reviwe>(reviweService.createReviwe(payload.get("reviweBody"), payload.get("imdbId")),
				HttpStatus.CREATED);
	}
//	public ResponseEntity<Reviwe> createReviwes(@RequestParam String reviweBody, @RequestParam String imdbId) {
//		System.out.println(reviweBody + " " + imdbId);
////		return new ResponseEntity<Reviwe>(reviweService.createReviwe(payload.get("reviewbody"), payload.get("imdbId")),
////				HttpStatus.CREATED);
//		return new ResponseEntity<Reviwe>(reviweService.createReviwe(reviweBody, imdbId), HttpStatus.CREATED);
//	}
}
