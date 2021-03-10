# JavaSpringDemo
Sample microservices using java spring and eureka for service discovery and load balancing.

Project contains 3 services 
  1. Movie Catalog - port - 9001 - /catalog/{userId}
  2. Movie Information - port - 9002 - /movies/{movieId}
  3. Movie Rating - port - 9003 - /ratingdata/{userId}

User send request to Catalog service for movies using user ID.
Catalog service fetch movie information from movie information service and ratings from the movie rating service.
Apart from these there is discovery service where services are registered and load balancing is done using eureka.

Discovery Service  - port  - 8761
