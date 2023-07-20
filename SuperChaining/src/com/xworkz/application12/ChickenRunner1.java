package com.xworkz.application12;

public class ChickenRunner1 {

	public static void main(String[] args) {
		
		
		BoilerChicken1 ref=new BoilerChicken1(400,"hassan",true,1);
		ref.printInfo();
		
		Chicken ref1=new BoilerChicken1(500,"mangaluru",true,2);
		ref1.printInfo();
		
		FarmChicken ref3=new FarmChicken(300, "bng", 19, "me");
		ref3.printInfo();
		
		Chicken ref4=new Chicken(20000, "Honavara");
		ref4.printInfo();
		
		
		
		
		

	}

}
