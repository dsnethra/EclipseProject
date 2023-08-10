package com.xowrkz.diamondrunner;

import com.xworkz.diamond.Cloth;
import com.xworkz.diamond.NikeCloth;
import com.xworkz.diamond.PumaCloth;

public class ClothRunner {
	 
	public static void main(String[] args)
	{
		
		ClothImplementation ref=new ClothImplementation();
		ref.cost();
		ref.pant();
		ref.shirt();
		
		PumaCloth ref2=new ClothImplementation();
		ref2.cost();
		ref2.shirt();
		
		NikeCloth ref3=new ClothImplementation();
		ref3.cost();
		ref3.pant();
		
		Cloth ref4=new ClothImplementation();
		ref4.cost();
		
	}
}
