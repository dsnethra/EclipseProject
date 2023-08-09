package com.xworkz.runner;

import com.xworkz.abstrac.SmartWatch;
import com.xworkz.abstrac.WashingMachine;

public class WashingMachineUser {
	
private WashingMachine washingmachine;
	
	
	public WashingMachineUser(WashingMachine washingmachine) {
		this.washingmachine=washingmachine;
	}
	
	
	void watch()
	{
		if(washingmachine!=null)
		{
			System.out.println("not null value");
			this.washingmachine.wash();
		}
		else
		{
			System.out.println("error");
		}
	}

}

