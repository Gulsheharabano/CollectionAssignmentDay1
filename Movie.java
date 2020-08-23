package com.collectionmasterassignment;

public class Movie {
	int Movieid;
	String Moviename;
	int Rating;
	public Movie(int movieid, String moviename, int rating) {
		super();
		Movieid = movieid;
		Moviename = moviename;
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [Movieid=" + Movieid + ", Moviename=" + Moviename + ", Rating=" + Rating + "]";
	}

}
