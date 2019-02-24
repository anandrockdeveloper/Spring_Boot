package com.anand.springboot.movierating;

public class MovieRating {

	private int movieId;
	private int rating;
	private String serverName;


	public MovieRating(int movieId, int rating,String serverName) {
		super();
		this.movieId = movieId;
		this.rating = rating;
		this.serverName=serverName;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}


}
