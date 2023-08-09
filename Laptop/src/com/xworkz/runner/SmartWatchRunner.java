package com.xworkz.runner;

import com.xworkz.abstrac.SmartWatch;
import com.xworkz.implement.SmartImplement;

public class SmartWatchRunner {
	
	public static void main(String[] args) {
		
		
		SmartWatch ref=new SmartImplement();
		SmartUser  ref2=new SmartUser(ref);
		ref2.watch();
	}

}
