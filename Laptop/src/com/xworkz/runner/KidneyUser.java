package com.xworkz.runner;

import com.xworkz.abstrac.Kidney;
import com.xworkz.abstrac.PrintingMachine;

public class KidneyUser {

	private Kidney kidney;
	
	
	public KidneyUser(Kidney kidney) {
		this.kidney=kidney;
	}
	
	
	public void  purify()
	{
		if(kidney!=null)
		{
			System.out.println("not null");
			this.kidney.stone();
		}
		else
		{
			System.err.println("error");
		}
	}

}
