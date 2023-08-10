package com.xworkz.diamond;

public interface PepsiCoolDrink extends CoolDrink{
	
	
	
	 default  void energy()
	{
		System.out.println("invoking energy in pepsicooldrink");
	}

}
