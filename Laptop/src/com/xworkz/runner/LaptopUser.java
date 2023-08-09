package com.xworkz.runner;

import com.xworkz.abstrac.Laptop;

public class LaptopUser   {
	
	private Laptop laptop;
	
	
	public LaptopUser(Laptop laptop)
	{
		this.laptop=laptop; 
		System.out.println("invoking laptop const");
	}
	
	public void laptop1()
	{
		if(laptop!=null)
		{
			System.out.println("not null values");
			this.laptop.display();
		}
		
		else {
			System.err.println("null value");
		}
	}
	
	
	
	
	
	

}
