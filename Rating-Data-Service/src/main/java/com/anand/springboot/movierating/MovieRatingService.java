package com.anand.springboot.movierating;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MovieRatingService")
public class MovieRatingService {
	
	public List<MovieRating> movieList= Arrays.
			asList(new MovieRating(1,5,"Server-2"),
					new MovieRating(2,3,"Server-2"),
					new MovieRating(3,4,"Server-2"));
	
	@RequestMapping("/{movieId}")
	public MovieRating getCatalog(@PathVariable int movieId)
	{
		return movieList.get(movieId-1);
	}

}
