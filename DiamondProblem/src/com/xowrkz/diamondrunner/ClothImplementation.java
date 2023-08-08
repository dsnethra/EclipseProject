package com.xowrkz.diamondrunner;

import com.xworkz.diamond.NikeCloth;
import com.xworkz.diamond.PumaCloth;

public class ClothImplementation implements NikeCloth,PumaCloth{

	@Override
	public void cost() {
		System.out.println("invoking cost in ClothImplementation");
		System.out.println("  ");
	}

	public void pant()
	{
	System.out.println("invoking pant in ClothImplementation");
	System.out.println("  ");
	}
	
	public void shirt()
	{
		System.out.println("invoking shirt in ClothImplementation");
		System.out.println("  ");
	}
}
