package com.xworkz.runner;

import com.xworkz.abstrac.PrintingMachine;
import com.xworkz.implement.PrintingMachineImplement;

public class PrintRunner {
	public static void main(String[] args) {
		
	

	PrintingMachine ref=new PrintingMachineImplement();
	
	PrintingMachineUser ref2=new PrintingMachineUser(ref);
  
	ref2.shop();
	
	
	}
}