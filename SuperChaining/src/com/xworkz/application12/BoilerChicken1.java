package com.xworkz.application12;

public class BoilerChicken1 extends Chicken{
	boolean alive;
	int weight;
	
	BoilerChicken1(int price,String location,boolean alive,int weight)
	{
		super(price,location);
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
