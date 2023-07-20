package com.xworkz.application12;

public class BoilerChicken extends FarmChicken  {
	boolean alive;
	int weight;
	
	BoilerChicken(int price,String location,int noOfDays, String careTaker,boolean alive,int weight)
	{
		super(price,location,noOfDays,careTaker);
		this.alive=alive;
		this.weight=weight;
		
		
	}
	
	@Override
	void printInfo()
	{
		super.printInfo();
		System.out.println(this.alive);
		System.out.println(this.weight);
	}
	
	
	

}
