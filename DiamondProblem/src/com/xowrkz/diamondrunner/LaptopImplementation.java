package com.xowrkz.diamondrunner;

import com.xworkz.diamond.Asus;
import com.xworkz.diamond.Lenovo;

public class LaptopImplementation implements Lenovo,Asus{

	@Override
	public String weight() {
		System.out.println("invoking weight in LaptopImplementaton");
		return "haevy";
	}
	
	@Override
	public void bag()
	{
		System.out.println("invoking bag in LaptopImplementation");
	}
	
	@Override
	public void price()
	{
		System.out.println("invoking price in LaptopImplementation");
	}

}
