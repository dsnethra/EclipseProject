package com.xworkz.diamond;

public class Runner {
	public static void main(String[] args)
	{
		BtmCoolDrink ref=new BtmCoolDrink();
		ref.cool();
		ref.energy();
		ref.stamina();
		
		CoolDrink ref2=new BtmCoolDrink();
		ref2.cool();
	
		PepsiCoolDrink ref3=new BtmCoolDrink();
		ref3.cool();
		ref3.energy();
		
		CokeCoolDrink ref4=new BtmCoolDrink();
		ref4.cool();
		ref4.stamina();
		
	
		
	}

}
