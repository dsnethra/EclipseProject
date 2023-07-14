package com.xworkz.application;

public class Movie {
	
	String movieName;
	String theatre;
	int ticketPrice=100;
	String location;
	
	Director director=new Director("Punneeth", "Annabond", 150);

	
	public Movie(String movieName,String theatre)
	{
		System.out.println("running string string const");
		this.movieName=movieName;
		this.theatre=theatre;

	}
	
	void setPrice(int ticketPrice)
	{
		System.out.println("running method");
		this.ticketPrice=ticketPrice;
	}
	
	void printinfo()
	{
		System.out.println("running Movie in printinfo");
		System.out.println("movie name:"+this.movieName);
		System.out.println("theatre name:"+this.theatre);
		System.out.println("ticket price:"+this.ticketPrice);
		System.out.println("location:"+this.location);
		System.out.println("  ");
		System.out.println("invoking diresctor movie class");
		//System.out.println(this.director.director_name);
		//System.out.println(this.director.movie);
		//System.out.println(this.director.networth);   or
		this.director.printInfo();
	}
}
