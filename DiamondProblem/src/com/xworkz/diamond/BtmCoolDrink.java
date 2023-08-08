package com.xworkz.diamond;

public class BtmCoolDrink implements PepsiCoolDrink,CokeCoolDrink {
	
	@Override
	public void cool(){
		System.out.println("running cool in BtmCoolDrinks");
	}

}
