package com.xworkz.diamond;

public interface CokeCoolDrink extends CoolDrink {
	
	
	
	 default void stamina()
	{
		System.out.println("invoking stamina in Cokecooldrinks");
	}

}
