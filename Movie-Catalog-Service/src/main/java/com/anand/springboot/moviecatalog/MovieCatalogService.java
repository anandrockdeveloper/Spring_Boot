package com.anand.springboot.moviecatalog;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MovieCatalogService")
public class MovieCatalogService {
	
	public List<MovieCatalog> movieList= Arrays.
			asList(new MovieCatalog("Transformer", "Sci-Fri", 1),
					new MovieCatalog("Titanic", "Romantic", 2),
					new MovieCatalog("Incidious", "Horror", 3));
	
	@RequestMapping("/{movieId}")
	public MovieCatalog getCatalog(@PathVariable int movieId)
	{
		return movieList.get(movieId-1);
	}

}
