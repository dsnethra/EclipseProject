package com.xworkz.runner;

import com.xworkz.abstrac.SmartWatch;

public class SmartUser {
	
	private SmartWatch smartwatch;
	
	
	public SmartUser(SmartWatch smartwatch) {
		this.smartwatch=smartwatch;
	}
	
	
	void watch()
	{
		if(smartwatch!=null)
		{
			System.out.println("not null value");
			this.smartwatch.showTime();
		}
		else
		{
			System.out.println("error");
		}
	}

}
