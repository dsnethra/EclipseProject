package com.xworkz.runner;

import com.xworkz.abstrac.WashingMachine;
import com.xworkz.implement.WashingImplements;

public class WashingMachineRunner {
public static void main(String[] args) {
		
		
		WashingMachine ref=new WashingImplements();
		WashingMachineUser  ref2=new WashingMachineUser(ref);
		ref2.watch();
	}

}


