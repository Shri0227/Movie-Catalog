package com.example.MovieCatalog.FeignClient;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("http://103.132.244.132:8083")
//@RibbonClient("localhost:8083")
public interface MovieDataClient {
	
	@RequestMapping(value = "/getMovies", method=RequestMethod.GET)
	public List<String> getAllMovies();

}
