package com.xworkz.application12;

public class FarmChicken extends Chicken {
	int noOfDays;
	String careTaker;
	
	public FarmChicken(int price, String location, int noOfDays, String careTaker) {
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;
	}
     @Override
	void printInfo()
	{
		super.printInfo();
		System.out.println(this.noOfDays);
		System.out.println(this.careTaker);
	}
	
	

}
