package com.anand.springboot.moviecatalog;

public class MovieCatalog {
	private String name;
	private String desc;

	private int movieId;

	public MovieCatalog(String name, String desc, int movieId) {
		super();
		this.name = name;
		this.desc = desc;
		this.movieId=movieId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

}
