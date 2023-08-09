package com.xworkz.runner;

import com.xworkz.abstrac.PrintingMachine;

public class PrintingMachineUser {
	
	private PrintingMachine print;
	
	
	public PrintingMachineUser(PrintingMachine print) {
		this.print=print;
	}
	
	
	public void  shop()
	{
		if(print!=null)
		{
			System.out.println("not null");
			this.print.xerox();
		}
		else
		{
			System.err.println("error");
		}
	}

}
