package com.example.productionproject.model;

import java.time.LocalDate;

public class Movie {

	private int movieId;
	private String movieName;
	private String heroName;
	private String heroine;
	private LocalDate releaseDate;
	private String language;
	private int length;
	private String movieType;
	private int productionId;
	
	public Movie() {
		super();
	}

	public Movie(int movieId, String movieName, String heroName, String heroine, LocalDate releaseDate, String language,
			int length, String movieType, int productionId) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroine = heroine;
		this.releaseDate = releaseDate;
		this.language = language;
		this.length = length;
		this.movieType = movieType;
		this.productionId = productionId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public int getProductionId() {
		return productionId;
	}

	public void setProductionId(int productionId) {
		this.productionId = productionId;
	}

	@Override
	public String toString() {
		return "movieId=" + movieId + ", movieName=" + movieName + ", heroName=" + heroName + ", heroine="
				+ heroine + ", releaseDate=" + releaseDate + ", language=" + language + ", length=" + length
				+ ", movieType=" + movieType + ", productionId=" + productionId ;
	}
	
	
	
}
