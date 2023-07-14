package com.xworkz.application;

public class Hotel {
	
	String hotelName;
	String famousFood;
	String location;
	int price;
	
	Owner owner=new Owner("Ajjappa",69,78.90);
	
	
	Hotel(String hotelName,String famousFood)
	{
		System.out.println("running String String const");
		this.hotelName=hotelName;
		this.famousFood=famousFood;
	}
	
	void setLocation(String location)
	{
		System.out.println("running method");
		this.location=location;
	}
	
	void printinfo()
	{
		System.out.println("hotel name:"+ this.hotelName);
		System.out.println("famous food:"+ this.famousFood);
		System.out.println("location:"+ location);
		System.out.println("price:"+ price);
		System.out.println("  ");
		
		System.out.println("invoking Owner in Hotel class");
		this.owner.printInfo();
	}

}
