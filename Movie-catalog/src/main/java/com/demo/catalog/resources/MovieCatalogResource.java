package com.demo.catalog.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;

import com.demo.catalog.models.CatalogItem;
import com.demo.catalog.models.Movie;
import com.demo.catalog.models.Rating;
import com.demo.catalog.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
		//get all rated movieId
		UserRating userRating = restTemplate.getForObject("http://movie-rating/ratingsdata/users/"+userId, UserRating.class);
		//fetch movie information using the movie id
		
		return userRating.getUserRating().stream().map(rating ->{
			Movie movie = restTemplate.getForObject("http://movie-info /movies/"+rating.getMovieId(), Movie.class);
			
	
			return new CatalogItem(movie.getName(),"test",rating.getRating()	);
		
		}).collect(Collectors.toList());
		
	}
}

/*			Movie movie = webClientBuilder.build()
							.get()
							.uri("http://localhost:9002/movies/"+rating.getMovieId())
							.retrieve()
							.bodyToMono(Movie.class)
							.block();
*/	
