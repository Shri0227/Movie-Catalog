package com.example.MovieCatalog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieCatalog.FeignClient.MovieDataClient;


@RestController
public class MovieCatalogController {
	
	@Autowired
	MovieDataClient client;
	
	@RequestMapping(value = "/getMovies", method = RequestMethod.GET)
	public List<String> getALlMovieName(){
		List<String> movies = new ArrayList<>();
		movies.add("abc");
		movies.addAll(client.getAllMovies());
		return movies;
	}
}
