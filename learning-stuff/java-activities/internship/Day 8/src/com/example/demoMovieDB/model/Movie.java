package com.example.demoMovieDB.model;
import java.time.LocalDate;

public class Movie {
	private int movieID;
	private String movieName;
	private String heroName;
	private String heroine;
	private LocalDate releasedDate;
	private String language;
	private int length;
	private String movieType;
	private int productionID;
	
	public Movie() {
		super();
	}
	
	public Movie(int movieID, String movieName, String heroName, String heroine, LocalDate releasedDate, String language,
			int length, String movieType, int productionID) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroine = heroine;
		this.releasedDate = releasedDate;
		this.language = language;
		this.length = length;
		this.movieType = movieType;
		this.productionID = productionID;
	}
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
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
	public LocalDate getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(LocalDate releasedDate) {
		this.releasedDate = releasedDate;
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
	public int getProductionID() {
		return productionID;
	}
	public void setProductionID(int productionID) {
		this.productionID = productionID;
	}

	@Override
	public String toString() {
		return "Movie ID=" + movieID + ", movieName=" + movieName + ", heroName=" + heroName + ", heroine="
				+ heroine + ", releasedDate=" + releasedDate + ", language=" + language + ", length=" + length
				+ ", movieType=" + movieType + ", productionID=" + productionID;
	}
	
	
	
	
}
