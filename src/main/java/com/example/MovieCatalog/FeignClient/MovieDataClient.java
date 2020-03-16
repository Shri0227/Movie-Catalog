package com.example.MovieCatalog.FeignClient;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "movie-data" , value = "movie-data", url = "http://127.0.0.1:8083")
//@RibbonClient("localhost:8083")
public interface MovieDataClient {
	
	@RequestMapping(value = "/getMovies", method=RequestMethod.GET)
	public List<String> getAllMovies();

}
