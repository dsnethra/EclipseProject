package com.xowrkz.diamondrunner;

import com.xworkz.diamond.Asus;
import com.xworkz.diamond.Laptop;
import com.xworkz.diamond.Lenovo;

public class LaptopRunner {
	public static void main(String[] args)
	{
		LaptopImplementation ref=new LaptopImplementation();
		ref.weight();
		ref.bag();
		ref.price();
		System.out.println(" ");
		
		Asus ref1=new LaptopImplementation();
		ref1.weight();
		ref1.price();
		System.out.println(" ");
		
		Lenovo ref2=new LaptopImplementation();
		ref2.weight();
		ref2.bag();
		System.out.println(" ");
		
		Laptop ref3=new LaptopImplementation();
		ref3.weight();
	}

}
