package com.xworkz.application;

public class MovieRunner {

	public static void main(String[] args) {
		
		System.out.println("running Movierunner");
		
		Movie movie=new Movie("Garuda","bgs");
		movie.setPrice(200);
		movie.location="hassan";
		
		movie.printinfo();
	}

}
