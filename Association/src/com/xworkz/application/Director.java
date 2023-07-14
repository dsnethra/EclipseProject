package com.xworkz.application;

public class Director {
	
	String director_name;
	String movie;
	double networth;
	
	
	Director(String director_name,String movie,double networth)
	{
		this.director_name=director_name;
		this.movie=movie;
		this.networth=networth;
	}
	
	void printInfo() {
		System.out.println("director name:"+ director_name);
		System.out.println("movie:"+ movie);
		System.out.println("networth:"+ networth);
	}

}
