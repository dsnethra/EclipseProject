package com.xworkz.application12;

public class Chicken {
	int price;
	String location;
	
	
	
	
	Chicken(int price,String location)
	{
		this.price=price;
		this.location=location;
	}
	
	void printInfo()
	{
		System.out.println(this.price);
		System.out.println(this.location);
	}
}

