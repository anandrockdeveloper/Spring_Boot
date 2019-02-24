package com.anand.springboot.movieInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/MovieInfoService")
public class MovieInfoService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{movieId}")
	public List<Object> getInfo(@PathVariable int movieId)
	{

		List<Object> info= new ArrayList<Object>();

		//Using Rest Template
		//		info.add(restTemplate.getForObject("http://localhost:8082/MovieCatalogService/"+movieId, Object.class));
		//		info.add(restTemplate.getForObject("http://localhost:8084/MovieRatingService/"+movieId, Object.class));

		//Using Webclient
		info.add(
				webClientBuilder.build()
				.get()
				.uri("http://Movie-Catalog-Service/MovieCatalogService/"+movieId)
				.retrieve().bodyToMono(Object.class).block());

		info.add(
				webClientBuilder.build()
				.get()
				.uri("http://Rating-Data-Service/MovieRatingService/"+movieId)
				.retrieve().bodyToMono(Object.class).block());

		return info;

	}

}
